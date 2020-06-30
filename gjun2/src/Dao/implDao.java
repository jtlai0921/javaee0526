package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.member;

public interface implDao {
	//資料庫連線方法
	static Connection getDb()
	{
		String url="jdbc:mysql://localhost:3306/gjun";
		String user="root";
		String password="1234";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection(url, user, password);
			return conn;
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
			return null;
		} catch (SQLException e) {
			
			e.printStackTrace();
			return null;
		}
	}
	
	
	//新增會員物件
	void add(member m);
	
	//讀取會員
	String query();
	
	
	//更新修改會員
	void update(int id,member m);
	
	//刪除會員
	void delete(int id);


	boolean queryAccount(String username, String password);


	boolean checkAccount(String username);
	

}
