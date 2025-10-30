package one_to_one_bidierctional_curd_operations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Driver d=new Driver(104, "abhih", 23, null);
		Licence l=new Licence(204, 565656909, "car", d);
		d.setL(l);
		
		et.begin();
		
		em.persist(l);
		em.persist(d);
		et.commit();
		
	}

}
