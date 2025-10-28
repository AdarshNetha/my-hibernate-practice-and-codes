package many_to_many_bidirectional;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.sun.tools.javac.code.Attribute.Array;

public class daolayer {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		
		Doctor d1=new Doctor(101, "adarsh", "General", null);
		Doctor d2=new Doctor(102, "abhi", "child", null);
		Doctor d3=new Doctor(103, "chandana", "pulomo", null);
		
		Patient p1=new Patient(201, "puja", "cough", Arrays.asList(d1,d2,d3));
		Patient p2=new Patient(202, "priya", "fever", Arrays.asList(d1,d2));
		Patient p3=new Patient(203, "shiva", "heartissue", Arrays.asList(d1,d3));
				
		
		d1.setPlist(Arrays.asList(p1,p2,p3));
		d2.setPlist(Arrays.asList(p1,p2));
		d3.setPlist(Arrays.asList(p1,p3));
		et.begin();
		em.persist(d1);
		em.persist(d2);
		em.persist(d3);
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		et.commit();
		

	}

}
