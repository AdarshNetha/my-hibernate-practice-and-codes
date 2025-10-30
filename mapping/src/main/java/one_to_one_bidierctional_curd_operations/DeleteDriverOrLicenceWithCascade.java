package one_to_one_bidierctional_curd_operations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteDriverOrLicenceWithCascade {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		Driver d=em.find(Driver.class, 103);
		em.remove(d);
		et.commit();
		System.out.println("removed succesfully");
		
		et.begin();
		Licence l=em.find(Licence.class, 204);
		System.out.println(l);
		em.remove(l);
		et.commit();
		System.out.println("succesfully deleted");

		
	}

}
