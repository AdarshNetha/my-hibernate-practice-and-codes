package many_to_one_unidirectonal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		College c=new College(101, "TKR");
		Student s1= new Student(201, "adarsh", 95, c);
		Student s2= new Student(202, "chandu", 96, c);
		
		et.begin();
		em.persist(c);
		em.persist(s1);
		em.persist(s2);
		et.commit();

	}

}
