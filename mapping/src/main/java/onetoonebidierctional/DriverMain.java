package onetoonebidierctional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
//		Driver d=new Driver(101, "Adarsh", 23, null);
//		Licence l=new Licence(201, 565659, "car", d);
//		d.setL(l);
//		
//		et.begin();
//		
//		em.persist(l);
//		em.persist(d);
//		et.commit();
		Driver d1=em.find(Driver.class, 101);
		System.out.println(d1);
		System.out.println(d1.getL());
	}

}
