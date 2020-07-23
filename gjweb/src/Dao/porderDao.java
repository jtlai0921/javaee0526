package Dao;

import javax.persistence.EntityManager;

import Model.member;
import Model.porder;

public class porderDao implements implDao{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void add(Object o) {
		EntityManager em=implDao.getDB();		
		em.getTransaction().begin();
		em.persist(o);
		em.getTransaction().commit();
		em.close();
		
		
	}

	@Override
	public Object get(int id) {
		EntityManager em=implDao.getDB();		
		porder p=em.find(porder.class, id);
		return p;
		
	}

	@Override
	public void update(Object o) {
		EntityManager em=implDao.getDB();	
		porder m1=(porder)o;
		
		porder m2=em.find(porder.class,m1.getId());
		
		if(m1.getName()!=null) m2.setName(m1.getName());
		if(m1.getProduct1()!=null) m2.setProduct1(m1.getProduct1());
		if(m1.getProduct2()!=null) m2.setProduct2(m1.getProduct2());
		if(m1.getProduct3()!=null) m2.setProduct3(m1.getProduct3());
		if(m1.getSum()!=null) m2.setSum(m1.getSum());
		if(m1.getDiscountprice()!=null) m2.setDiscountprice(m1.getDiscountprice());
		
		em.getTransaction().begin();
		em.merge(m2);
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public void delete(int id) {
		EntityManager em=implDao.getDB();
		porder m=em.find(porder.class,id);
		
		em.getTransaction().begin();
		em.remove(m);
		em.getTransaction().commit();
		em.close();
		
		
	}

}
