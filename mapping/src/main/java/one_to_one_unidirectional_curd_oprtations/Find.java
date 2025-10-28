package one_to_one_unidirectional_curd_oprtations;

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
		Addar a=em.find(Addar.class, 101);
		System.out.println(a.getId());
		System.out.println(a.getAddar());
		System.out.println(a.getAddress());
		
		System.out.println("------------------------------");
		Person p=em.find(Person.class, 201);
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getAddar().getAddar());
		
		et.commit();
	}

}
