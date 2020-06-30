package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.member;



public class memberDao implements implDao{

	public static void main(String[] args) {
		//new memberDao().delete(4);
		
		System.out.println(new memberDao().checkAccount("abc"));
	
	}

	@Override
	public void add(member m) {
		
		
		String sql="insert into member(name,username,password,phone,address) values(?,?,?,?,?)";
				
			Connection conn=implDao.getDb();
			PreparedStatement ps;
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, m.getName());
				ps.setString(2, m.getUsername());
				ps.setString(3, m.getPassword());
				ps.setString(4, m.getPhone());
				ps.setString(5, m.getAddress());
				
				ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		

		
	}

	@Override
	public String query() {
		String Sql="select * from member";
		
		Connection conn=implDao.getDb();
		
		try {
			PreparedStatement ps=conn.prepareStatement(Sql);
			ResultSet rs=ps.executeQuery();
			String str="";
			while(rs.next())
			{
				str=str+"id:"+rs.getInt("id")+
						"\t名:"+rs.getString("name")+
						"\t帳號:"+rs.getString("username")+
						"\t密碼:"+rs.getString("password")+
						"\t電話:"+rs.getString("phone")+
						"\t地址:"+rs.getString("address")+"<br>";
			}
			
			return str;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	}

	@Override
	public void update(int id, member m) {
		String Sql="update member set name=?,password=? where id=?";
		
		Connection conn=implDao.getDb();
		
		try {
			PreparedStatement ps=conn.prepareStatement(Sql);
			ps.setString(1, m.getName());
			ps.setString(2, m.getPassword());
			ps.setInt(3, id);
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int id) {
		String Sql="delete from member where id=?";
		Connection conn=implDao.getDb();
		
		
		try {
			PreparedStatement ps=conn.prepareStatement(Sql);
			ps.setInt(1, id);
			ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean queryAccount(String username, String password) {
		String sql="select * from member where username=? and password=?";
		Connection conn=implDao.getDb();
		
		boolean m=false;
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs=ps.executeQuery();
		
		
			m=rs.next();
			
			return m;
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return m;
		}
		
		
		
		
	
	}

	@Override
	public boolean checkAccount(String username) {
		String sql="select * from member where username=? ";
		Connection conn=implDao.getDb();
		
		boolean m=false;
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, username);
		
			
			ResultSet rs=ps.executeQuery();
		
		
			m=rs.next();
			
			return m;
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return m;
		}
	}

}