package one_to_one_bidierctional_curd_operations;

import java.util.Scanner;

public class MobileSimUi {
	public static void main(String[] args) {
		MobileSimDao dao=new MobileSimDao();
		boolean key=true;
		Scanner sc=new Scanner(System.in);
		while (key) 
		{
			System.out.println("main menu \n choose your choice");
			System.out.println("1.Add \n 2.find \n 3.update \n 4.exit");
			switch (sc.nextInt()) {
			case 1:
			{
				System.out.println("enter the phone id");
				int pid=sc.nextInt();
				System.out.println("enterv the phone model");
				String model=sc.next();
				System.out.println("enter the sim id");
				int sid=sc.nextInt();
				System.out.println("enter the serice provider");
				String provider=sc.next();
				System.out.println("enter the phone number with l letter at the last");
				long phno=sc.nextLong();
				
				Mobile m=new Mobile(pid, model, null);
				SimCard s=new SimCard(sid, provider, phno, m);
				m.setSim(s);
				
				dao.add(m,s);
			}
				
				break;
			case 2:
			{
				boolean key2=true;
				while(key2) {
				System.out.println("choose 1.find mobile along with sim detials \n 2.find sim along with mobile \n 3.find all sim and mobile data \n 4.main menu");
				switch (sc.nextInt()) {
				case 1:
				{
					System.out.println("enter the mobile id");
					dao.findByMobileId(sc.nextInt());
				}					
					break;
				case 2:
				{
					System.out.println("enter the sim id");
					dao.findBySimId(sc.nextInt());
				}
				break;
				case 3:
				{
					dao.findAll();
				}
				break;
				case 4:
				{
					key2=false;
				}
				break;

				default:
					System.out.println("invalid input");
					break;
				}
				}
			}
				break;
			case 3:
			{
				boolean key3=true;
				while(key3)
				{
					System.out.println("what you want to update\n 1.mobile data\n 2.sim data ");
					switch (sc.nextInt())
					{
					case 1:
					{
						boolean key4=true;
						while(key4)
						{ System.out.println("what you want to update 1.update mobile brand \n 2.previous menu");
							switch(sc.nextInt())
							{
								case 1:
								{
									System.out.println("enter the id");
									int id=sc.nextInt();
									System.out.println("enter the new brand");
									String brand=sc.next();
									dao.upadteMobileBrandById(id,brand);
								}
								break;
								case 2:
								{
									key=false;
								}
								break;
								default:
									System.out.println("invalid input");
									break;
							
							}
						}						
					}
						break;
					case 2:
					{
						boolean key4=true;
						while(key4)
						{ System.out.println("what you want to update 1.update sim provider name \n  2.phone number \n 3.previous menu");
							switch(sc.nextInt())
							{
								case 1:
								{
									System.out.println("enter the id");
									int id=sc.nextInt();
									System.out.println("enter the new sim provider name");
									String provider=sc.next();
									dao.upadteSimProvierById(id,provider);
								}
								break;
								case 2:
								{
									System.out.println("enter the id");
									int id=sc.nextInt();
									System.out.println("enter the new phone number");
									long phnumber=sc.nextLong();
									dao.upadtePhoneNumberById(id,phnumber);
								}
								case 3:
								{
									key=false;
								}
								break;
								default:
									System.out.println("invalid input");
									break;
							
							}
						}			
					}
					break;
					default:
						break;
					}
				}
			}
				break;
			case 4:
			{
				key=false;
				System.out.println("thank you");
			}
				break;

			default:
				break;
			}
		}

	}

}
