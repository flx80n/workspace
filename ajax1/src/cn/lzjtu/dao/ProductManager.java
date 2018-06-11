package cn.lzjtu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.lzjtu.Utils.JDBCUtil;
import cn.lzjtu.domain.Product;


public class ProductManager {
	public List<Product> findAll(){
		
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<Product> rows = new ArrayList<Product>();
		String sql = "select id,name,price,pic,ctime from product";
		try {
			conn = JDBCUtil.getConnection();
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()){
				Product pro = new Product();
				pro.setId(rs.getInt("id"));
				pro.setName(rs.getString("name"));
				pro.setPrice(rs.getDouble("price"));
				pro.setPic(rs.getString("pic"));
				pro.setCtime(rs.getInt("ctime"));
				rows.add(pro);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}
	
	public static void main(String[] args) {
		List<Product> rows = new ProductManager().findAll();
		for (int i = 0; i < rows.size(); i++) {
			System.out.println(rows.get(i).toString());
		}
		
	}

}
