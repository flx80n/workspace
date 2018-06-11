package cn.lzjtu.Utils;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/*
 * JDBC 工具类
 * 
 * 管理连接 
 * 
 */

public class JDBCUtil {
	private static String driverClass;
	private static String url;
	private static String user;
	private static String password;

	// 1、加载驱动
	static{
		try {
			driverClass = "com.mysql.jdbc.Driver";
			Class.forName(driverClass);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("加载驱动异常");
		}
	}
	// 2、创建连接
	public static Connection getConnection() throws SQLException{
		url = "jdbc:mysql://127.0.0.1/emp?useUnicode=true&characterEncoding=utf-8";
		user = "root";
		password = "";
		return DriverManager.getConnection(url,user,password);
	}
	
	// 3、释放资源
	public static void close(Connection conn){
		if(conn != null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	
}
