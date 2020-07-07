package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Model.porder;

public interface implDao {
	//建立連線Connection方法
	static Connection getDb()
	{
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/gjun";
		String user="root";
		String password="1234";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url, user, password);
			return conn;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("no Driver");
			return conn;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("no connection");
			return conn;
		}
		
	}
	
	//新增訂單
	void add(porder p);
	

}