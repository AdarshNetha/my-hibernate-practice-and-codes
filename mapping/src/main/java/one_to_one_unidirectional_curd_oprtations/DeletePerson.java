package one_to_one_unidirectional_curd_oprtations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeletePerson {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		Person p=em.find(Person.class, 101);
		if(p!=null)
		{
			em.remove(p);
		}
		et.commit();
		System.out.println("removed succesfull");
	}

}
