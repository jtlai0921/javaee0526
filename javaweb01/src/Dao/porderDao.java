package Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.porder;

public class porderDao implements implDao{

	public static void main(String[] args) {
		
		System.out.println(implDao.getDb());
		/*
		porder p=new porder();
		p.add(10, 10, 10);
		
		new porderDao().add(p);
		*/
	}

	@Override
	public void add(porder p) {
		String sql="insert into product(product,product2,product3,sum,dis,pdata) "+
	"values(?,?,?,?,?,?)";
		
		Connection conn=implDao.getDb();
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, p.getProduct1());
			ps.setInt(2, p.getProduct2());
			ps.setInt(3, p.getProduct3());
			ps.setInt(4, p.getSum());
			ps.setInt(5, p.getDiscountprice());
			java.sql.Date d=new java.sql.Date(p.getPdate().getTime());
			
			ps.setDate(6, d);
			
			ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}