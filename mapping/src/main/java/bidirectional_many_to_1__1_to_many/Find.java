package bidirectional_many_to_1__1_to_many;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		Library l=em.find(Library.class, 201);
		System.out.println(l);
		System.out.println(l.getBook());
		Book b=em.find(Book.class, 101);
		System.out.println(b);
		System.out.println(b.getL());
	}

}
