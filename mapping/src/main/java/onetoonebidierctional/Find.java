package onetoonebidierctional;

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
		Driver d1=em.find(Driver.class, 101);
		System.out.println(d1);
//		System.out.println(d1.getL());

	}

}
