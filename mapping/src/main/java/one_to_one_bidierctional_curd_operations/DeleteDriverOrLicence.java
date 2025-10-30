package one_to_one_bidierctional_curd_operations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteDriverOrLicence {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
//		et.begin();
//		Driver d1=em.find(Driver.class, 101);
//		em.remove(d1); //it is not possible here we has connect to licence via forigen key
//		et.commit();
		
		et.begin();
		Licence l=em.find(Licence.class, 201);
		em.remove(l);  // exception of forigen key because it ha connection driver
		et.commit();

	}

}
