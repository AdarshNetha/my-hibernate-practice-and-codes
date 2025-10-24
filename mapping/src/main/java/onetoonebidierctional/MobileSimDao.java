package onetoonebidierctional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MobileSimDao {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void add(Mobile m, SimCard s) {
		et.begin();
		em.persist(m);
		em.persist(s);
		et.commit();
		System.out.println("data saved succesfully");
		
	}

	public void findByMobileId(int id) 
	{
		Mobile m=em.find(Mobile.class, id);
		System.out.println(m);
		System.out.println(m.getSim());
	}

	public void findBySimId(int nextInt) {
		SimCard s=em.find(SimCard.class, nextInt);
		System.out.println(s);
		System.out.println(s.getM());	
	}

}
