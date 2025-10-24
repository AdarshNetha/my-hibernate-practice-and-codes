package company;

import java.util.Scanner;

public class EmployeeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Employee employee=new Employee();
		EmployeeDao employeeDao=new EmployeeDao();
		
		boolean flag=true;
		while(flag)
		{
			System.out.println("main menu");
			System.out.println("enter your choice \n 1.add the employee \n 2. find  \n 3.update employee by id \n4.delete employee data \n 5.exit");
			switch (sc.nextInt()) {
			case 1:
			{
				System.out.println("enter the empid");
				employee.setId(sc.nextInt());
				System.out.println("enter the name");
				employee.setName(sc.next());
				System.out.println("enter the salary");
				employee.setSalary(sc.nextDouble());
				System.out.println("enter the phone");
				employee.setPhn(sc.nextLong());
				System.out.println("enter the address");
				employee.setAddress(sc.next());
				
				employeeDao.save(employee);
				
			}
				
				break;
			case 2:{
				boolean flag1=true;
				while(flag1) {
					System.out.println("choose the option \n 1.find by id \n 2.find all \n 3.main menu");
					switch (sc.nextInt()) {
					case 1:
					{
						System.out.println("enter the employee id to search");
						int id=sc.nextInt();
						employeeDao.search(id);
					}
						
						break;
					case 2:
					{
						employeeDao.findAll();
					}
						break;
					case 3:
					{
						flag1=false;
					}
					default:
						break;
					}
				}
				
				
			}
				
				break;
			case 3:
				
				boolean flag2=true;
				while(flag2)
				{
					System.out.println("enter the which data u want to update 1.id\n 2.name\n 3.salary\n 4.phone\n 5.address\n 6.main menu");
					switch (sc.nextInt())
					{
					case 1:
					{
						System.out.println("enter the old id of user to update");
						int oldId=sc.nextInt();
						System.out.println("enter the new id");
						int newId=sc.nextInt();
						employeeDao.updateId(oldId,newId);
					}
						
						break;
					case 2:
					{
						System.out.println("enter the id");
						int id=sc.nextInt();
						System.out.println("enter the name which you want to add");
						String name=sc.next();
						employeeDao.updateName(id, name);
					}
						
						break;
					case 3:
					{
						System.out.println("enter the id");
						int id=sc.nextInt();
						System.out.println("enter the salary which you want to modify");
						double salary=sc.nextDouble();
						employeeDao.updateSalary(id, salary);
					}
	
						break;
					case 4:
					{
						System.out.println("enter the id");
						int id=sc.nextInt();
						System.out.println("enter the phone which you want to modify");
						long phone=sc.nextLong();
						employeeDao.updatePhone(id, phone);
						
					}
	
						break;
					case 5:
					{
						System.out.println("enter the id");
						int id=sc.nextInt();
						System.out.println("enter the address which you want to modify");
						String address=sc.next();
						employeeDao.updateAddress(id, address);
					}
	
						break;
					case 6:
					{
						flag2=false;
						
					}
	
						break;

					default:
						break;
					}
				}
				
				
				
				break;
			case 4:
			{
				System.out.println("enter the id whose data want to delete");
				employeeDao.deleteId(sc.nextInt());
			}
				break;
			case 5:
					flag=false;
				break;

				

			default:
				break;
			}			
		}

	}

}
