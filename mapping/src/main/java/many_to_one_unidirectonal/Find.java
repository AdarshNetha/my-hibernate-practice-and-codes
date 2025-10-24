package many_to_one_unidirectonal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Find {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		
		et.begin();
		Student s1=em.find(Student.class, 201);
		System.out.println(s1);
		College c=em.find(College.class, 101);
		System.out.println(c);

	}

}
