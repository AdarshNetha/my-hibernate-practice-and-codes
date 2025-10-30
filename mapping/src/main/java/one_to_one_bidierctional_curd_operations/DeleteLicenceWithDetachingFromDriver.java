package one_to_one_bidierctional_curd_operations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteLicenceWithDetachingFromDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		Driver d= em.find(Driver.class,102);
		d.setL(null);
		em.merge(d);
		Licence l=em.find(Licence.class, 202);
		em.remove(l);
		et.commit();
		System.out.println("remove succesfully");

	}

}
