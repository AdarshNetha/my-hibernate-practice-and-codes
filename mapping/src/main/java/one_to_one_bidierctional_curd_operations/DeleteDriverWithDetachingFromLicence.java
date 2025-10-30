package one_to_one_bidierctional_curd_operations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteDriverWithDetachingFromLicence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		Licence l= em.find(Licence.class, 201);
		l.setD(null);
		em.merge(l);
		Driver d=em.find(Driver.class, 101);
		em.remove(d);
		et.commit();
System.out.println("succesfully deleted driver");
		
	}

}
