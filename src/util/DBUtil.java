package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import com.sun.org.apache.commons.collections.StaticBucketMap;


public class DBUtil {
	public static Connection getConnection(){
		Connection conn=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db161",
					"root","hsc123");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return conn;
	}
	public static void close(Connection conn){
		if(conn!=null){
			try{
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
}
