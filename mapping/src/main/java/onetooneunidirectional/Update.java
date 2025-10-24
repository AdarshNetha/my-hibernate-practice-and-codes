package onetooneunidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		Person p=em.find(Person.class,201);
		if(p!=null)
		{
			p.setAge(25);
			em.merge(p);
		}
		et.commit();
		System.out.println("update succesfull");
	}

}
