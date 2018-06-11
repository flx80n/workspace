package cn.lzjtu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.lzjtu.Utils.JDBCUtil;
import cn.lzjtu.domain.Car;
import cn.lzjtu.domain.Che;


public class CarManager {
	public Car getDetailById(int id){
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		Car car = null;
		String sql = "SELECT id,name,price,counts,brand,city FROM t_car WHERE id = ?";
		try {
			conn = JDBCUtil.getConnection();
			pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			rs = pst.executeQuery();
			while(rs.next()){
				car= new Car();
				car.setId(rs.getInt("id"));
				car.setName(rs.getString("name"));
				car.setPrice(rs.getDouble("price"));
				car.setCount(rs.getInt("counts"));
				car.setBrand(rs.getString("brand"));
				car.setCity(rs.getString("city"));
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
		return car;
	}
	
	public List<Che> findAllByType(String type){
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<Che> rows = new ArrayList<Che>();
 		Che che = null;
		String sql = "SELECT id,name,discountPrice,thumeImg FROM t_che WHERE type = ?";
		try {
			conn = JDBCUtil.getConnection();
			pst = conn.prepareStatement(sql);
			pst.setString(1, type);
			rs = pst.executeQuery();
			while(rs.next()){
				che= new Che();
				che.setId(rs.getInt("id"));
				che.setName(rs.getString("name"));
				che.setDiscountPrice(rs.getDouble("discountPrice"));
				che.setThumeImg(rs.getString("thumeImg"));
				rows.add(che);
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
//	public static void main(String[] args) {
//		System.out.println(new CarManager().findAllByType("lt30").size());
//	}
}
