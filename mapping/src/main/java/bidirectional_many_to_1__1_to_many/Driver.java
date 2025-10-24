package bidirectional_many_to_1__1_to_many;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Book b1=new Book(101, "learn to live", 199, null);
		Book b2=new Book(102,"harry porter",500,null);
		Library l=new Library(201,"xyz",Arrays.asList(b1,b2));
		
		b1.setL(l);
		b2.setL(l);
		
		et.begin();
		em.persist(l);
		em.persist(b1);
		em.persist(b2);
		et.commit();

	}

}
