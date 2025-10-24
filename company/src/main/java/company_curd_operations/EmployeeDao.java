package company_curd_operations;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeDao {
	
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("compnanyapp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Employee emp=null;
		
		public void save(Employee employee) {
			
			entityTransaction.begin();
			entityManager.persist(employee);
			System.out.println("data entered succesfully....");
			entityTransaction.commit();
			
		}

		public void search(int id) {
			emp=entityManager.find(Employee.class, id);
			
			if(emp!=null)
			{
				System.out.println(emp);
			}
			else {
				System.out.println("no id present try again");
			}
			
		}

		public void updateName(int id,String name) {
			emp=entityManager.find(Employee.class, id);
			entityTransaction.begin();
			if(emp!=null) 
			{
				emp.setName(name);
			}
			entityTransaction.commit();
		}

		public void deleteId(int id) {
			emp=entityManager.find(Employee.class, id);
			if(emp!=null)
			{
				entityTransaction.begin();
				entityManager.remove(emp);
				entityTransaction.commit();
			}
		}

		public void findAll() {
			
			String query="select e from Employee e";
			List<Employee> emplist=entityManager.createQuery(query).getResultList();
			System.out.println(emplist);
		}



		public void updateSalary(int id, double salary) {
			emp=entityManager.find(Employee.class, id);
			if(emp!=null)
			{
				entityTransaction.begin();
				emp.setSalary(salary);
				entityManager.merge(emp);
				entityTransaction.commit();
			}
			
		}

		public void updatePhone(int id, long phone) {
			emp=entityManager.find(Employee.class, id);
			if(emp!=null)
			{
				entityTransaction.begin();
				emp.setPhn(phone);
				entityManager.merge(emp);
				entityTransaction.commit();
			}
			
		}

		public void updateAddress(int id, String address) {
			emp=entityManager.find(Employee.class, id);
			entityTransaction.begin();
			if(emp!=null) 
			{
				emp.setAddress(address);
			}
			entityTransaction.commit();
			
		}

	
		
	}


