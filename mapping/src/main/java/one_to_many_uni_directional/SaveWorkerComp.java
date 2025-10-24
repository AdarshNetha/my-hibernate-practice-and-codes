package one_to_many_uni_directional;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveWorkerComp {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Worker w1=new Worker(101, "Adarsh", 50000);
		Worker w2= new Worker(102,"chandu",50000);
		Company c=new Company(201,"wipro",Arrays.asList(w1,w2));
		
		et.begin();
		em.persist(w1);
		em.persist(w2);
		em.persist(c);
		et.commit();
		
	}

}
