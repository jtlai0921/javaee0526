package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public interface implDao {
	//連線方法
	static EntityManager getDB()
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("gjweb");		
		EntityManager em=emf.createEntityManager();		
		return em;
	}
	
	//新增物件
	void add(Object o);	
	
	
	//查詢物件--->透過ID
	Object get(int id);
	
	//修改物件
	void update(Object o);
	
	
	//刪除物件	
	void delete(int id);

}
