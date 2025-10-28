package one_to_one_unidirectional_curd_oprtations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteAddar {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
//		Person p=em.find(Person.class, 201);
//		p.setAddar(null);
//		em.merge(p);
		Addar a=em.find(Addar.class, 101);
		em.remove(a);
		et.commit();

	}

}
