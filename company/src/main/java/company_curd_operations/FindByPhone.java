package company_curd_operations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FindByPhone {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("compnanyapp");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		 et.begin();
		 String query="select e from Employee e where e.phn=:ph";
		 Employee foundEmp=(Employee) em.createQuery(query).setParameter("ph", 6309489072l).getSingleResult();
		 System.out.println(foundEmp);
		 et.commit();
				
	}
}
