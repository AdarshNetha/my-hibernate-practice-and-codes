package company;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FindAllData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("compnanyapp");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		String query="select e from Employee e";
		List<Employee> empList=em.createQuery(query).getResultList();
		System.out.println(empList);
		et.commit();
	}

}
