package cn.lzjtu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import cn.lzjtu.Utils.JDBCUtil;

import cn.lzjtu.domain.Student;

public class StudentManager {
	public boolean findBySN(String sn){
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		int count = 0 ;
		String sql = "select count(id) from t_student where sn = ?";
		try {
			conn = JDBCUtil.getConnection();
			pst = conn.prepareStatement(sql);
			pst.setString(1,sn);
			rs = pst.executeQuery();
			if(rs.next()){
				count = rs.getInt(1);
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
		return count>0;
	}
	
	
	public void save(Student stu){
		Connection conn = null;
		PreparedStatement pst = null;
		String sql = "insert into t_student(id,sn,name) values(null,?,?)";
		try {
			conn = JDBCUtil.getConnection();
			pst = conn.prepareStatement(sql);
			pst.setString(1,stu.getSn());
			pst.setString(2, stu.getName());
			pst.executeUpdate();
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
	}
	
	public List<Student> findAllByClasszzId(String clazzid){
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<Student> rows = new ArrayList<Student>();
		Student stu = null;
		
		String sql = "select id,name,clazzId from t_stu2 where clazzId = ?";
		try {
			//1加载驱动 2创建连接
			conn = JDBCUtil.getConnection();
			//3创建prepareStatement对象
			pst = conn.prepareStatement(sql);
			pst.setString(1,clazzid);
			//4执行sql语句,返回结果集，处理结果集
			rs = pst.executeQuery();
			while(rs.next()){
				stu = new Student();
				stu.setId(rs.getInt("id"));
				stu.setName(rs.getString("name"));
				stu.setClazzid(rs.getString("clazzId"));
				//添加到集合
				rows.add(stu);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//5关闭连接
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
//		System.out.println(new StudentManager().findAllByClasszzId("java1607"));
//	}
}
