package Controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Model.member;

public class test {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("gjun");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select m from member m");
		
		List l=q.getResultList();
		
		for(Object o:l)
		{
			member m=(member)o;
			System.out.println(m.getId()+","+m.getName()+","+m.getUsername());
		}
		
		
		//System.out.println(q.getResultList());
		
		
		/*member m=new member();
		m.setId(11);
		m.setName("a");
		m.setUsername("a");
		m.setPassword("012");
		m.setPhone("000");
		m.setAddress("tt");
		
		em.getTransaction().begin();
		em.merge(m);
		em.getTransaction().commit();
		em.close();
		*/
		
		
		
		//member m=em.find(member.class, 10);
		//member m=em.getReference(member.class, 1);
		//System.out.println(m);
		//System.out.println(em.contains(m));
		//System.out.println(m.getName()+","+m.getUsername());
		
		/*em.getTransaction().begin();		
		em.remove(m);		
		em.getTransaction().commit();		
		em.close();*/
		
		
		
		
		
		/*member m=new member();
		m.setName("aaaddd");
		m.setUsername("tt");
		m.setPassword("0123");
		m.setPhone("0000");
		m.setAddress("pp");
		
		em.getTransaction().begin();
		em.persist(m);
		em.getTransaction().commit();
		
		em.close();*/

	}

}