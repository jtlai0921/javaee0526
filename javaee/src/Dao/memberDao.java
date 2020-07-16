package Dao;

import javax.persistence.EntityManager;

import Model.member1;

public class memberDao implements implDao{

	public static void main(String[] args) {
		//System.out.println(implDao.getDB());
		
		member1 m=new member1();
		m.add("dffef", "uu", "1", "123", "台北", "false");
		
		new memberDao().add(m);
		
		//member m=(member)new memberDao().get(2);
		
		//System.out.println(m.getName());
		
		//member1 m=new member1();
		//m.setId(1);
		//m.setName("ff");
		//m.setUsername("yy");
		//m.setPassword("0000");
		//m.setPhone("0123");
		//m.setAddress("台北");
		//m.setAdmin(false);
		
		//new memberDao().update(m);
		
		//new memberDao().delete(2);
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
		member1 m=em.find(member1.class, id);
		return m;
	}

	@Override
	public void update(Object o) {
		EntityManager em=implDao.getDB();	
		member1 m1=(member1)o;
		
		member1 m2=em.find(member1.class,m1.getId());
		
		if(m1.getName()!=null) m2.setName(m1.getName());
		if(m1.getUsername()!=null) m2.setUsername(m1.getUsername());
		if(m1.getPassword()!=null) m2.setPassword(m1.getPassword());
		if(m1.getPhone()!=null) m2.setPhone(m1.getPhone());
		if(m1.getAddress()!=null) m2.setAddress(m1.getAddress());
		if(m1.getAdmin()!=null) m2.setAdmin(m1.getAdmin());
		
		em.getTransaction().begin();
		em.merge(m2);
		em.getTransaction().commit();
		em.close();
		
		
	}

	@Override
	public void delete(int id) {
		EntityManager em=implDao.getDB();
		member1 m=em.find(member1.class,id);
		
		em.getTransaction().begin();
		em.remove(m);
		em.getTransaction().commit();
		em.close();
		
		
		
	}

}