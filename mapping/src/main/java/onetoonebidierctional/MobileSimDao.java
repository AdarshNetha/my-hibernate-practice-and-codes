package onetoonebidierctional;

import java.util.List;

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

	public void findBySimId(int id) {
		SimCard s=em.find(SimCard.class, id);
		System.out.println(s);
		System.out.println(s.getM());	
	}

	public void upadteMobileBrandById(int id, String brand) {
		Mobile m=em.find(Mobile.class, id);
		m.setModel(brand);
		et.begin();
		em.merge(m);
		et.commit();		
	}

	public void upadteSimProvierById(int id, String provider) {
		SimCard s=em.find(SimCard.class, id);
		s.setProvider(provider);
		et.begin();
		em.merge(s);
		et.commit();
	}

	public void upadtePhoneNumberById(int id, long phnumber) {
		SimCard s=em.find(SimCard.class, id);
		
	}

	public void findAll() {
		String query1="select m from Mobile m";
		String query2="select s from SimCard s";
		List<Mobile>Mobilelist=em.createQuery(query1).getResultList();
		List<SimCard>Simlist=em.createQuery(query2).getResultList();
		System.out.println(Mobilelist);
		System.out.println(Simlist);
		
	}

}
