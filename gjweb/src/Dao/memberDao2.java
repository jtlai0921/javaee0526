package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Model.member;

public class memberDao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(memberDao2.queryUser("hh"));

	}
	//判斷是否有此帳號
	public static member query(String username,String password)
	{
		EntityManager em=implDao.getDB();
		
		Query q=em.createQuery("select m from member m where m.username=?1 and m.password=?2");
		q.setParameter(1, username);
		q.setParameter(2, password);
		
		List l=q.getResultList();
		member m=null;
		
		for(Object o:l)
		{
			m=(member)o;
		}
		
		return m;
	}
	
	public static member queryUser(String username)
	{
		EntityManager em=implDao.getDB();
		
		Query q=em.createQuery("select m from member m where m.username=?1");
		q.setParameter(1, username);
		
		
		List l=q.getResultList();
		member m=null;
		
		for(Object o:l)
		{
			m=(member)o;
		}
		
		return m;
	}


}