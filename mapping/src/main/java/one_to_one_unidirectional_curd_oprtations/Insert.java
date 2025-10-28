package one_to_one_unidirectional_curd_oprtations;

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
		
		Addar addar=new Addar(101,587844231426l,"kaspur");
		Person person=new Person(201,"adarsh",23,addar);
		
		et.begin();
		em.persist(person);
		et.commit();
	}
}
