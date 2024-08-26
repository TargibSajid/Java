import java.util.*;
class Main
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("\n===Welcome to Contact management System ===");

		System.out.println("===== Developed By java Sec c =======");

		System.out.println("\n");



		System.out.println("\nAT first input your contacts ");

		System.out.println("\n how many contacts you want to enter : ");

		int contactNumber = sc.nextInt();

		sc.nextLine();


		Contact contact[] = new Contact[contactNumber];

		for(int i = 0 ; i < contactNumber ; i++)
		{
			contact[i] = new Contact();

			System.out.print("\nEnter the Contact no." + (i+1) + " name: ");

			contact[i].setName(sc.nextLine());

			System.out.print("Enter the Contact no." + (i+1) + " Phone Number: ");

			contact[i] .setPhnNumber(sc.nextInt());

			sc.nextLine();


		}

		boolean flag = false;
		int tContactNumber = 0;

		Contact newContact[] = new Contact[100];

		while(true)
		{

			System.out.println("\n1.Show avaiable Contact.");
			System.out.println("2.insert a New Contact.");
			System.out.println("3.Show a Contact.");
			System.out.println("4.Delete a Contact");
			System.out.println("5.Search a Contact By Name.");
			System.out.println("6.Search a Contact By Number.");
			System.out.println("7.Update a Contact");
			System.out.println("0.Exit.");

			System.out.print("\nEnter your option: ");
			
			int option = sc.nextInt();

			if(option == 1)
			{
				if(flag == false){

					for (int j = 0 ; j < contactNumber ; j++)
				{

					System.out.print("Here is the  Contact No " + (j+1) + " : ");

					System.out.println( " Name : " +contact[j].getName() + " Number : " + contact[j].getPhnNumber()) ;


				}

				}

				else if(flag == true)
				{
					for (int t = 0 ; t < tContactNumber ; t++)
				{

					System.out.print("Here is the  Contact No " + (t+1) + " : ");

					System.out.println( " Name : " +newContact[t].getName() + " Number : " + newContact[t].getPhnNumber()) ;


				}
				}
				
			}

			else if(option == 2)
			{
				System.out.print("How many contact you want to insert: ");

				int newContactNumber = sc.nextInt();

				tContactNumber = newContactNumber + contactNumber;

				int remContactNumber = tContactNumber - contactNumber;



				

				for(int p = 0 ; p < contactNumber ; p++)
				{
					newContact[p] = contact[p];
				}

				for(int u = contactNumber; u < tContactNumber ; u++)
				{
					System.out.println("Enter the Contact Name: ");

					newContact[u] = new Contact();

					sc.nextLine();

					newContact[u].setName(sc.nextLine());

					System.out.println("Enter the number : ");

					newContact[u].setPhnNumber(sc.nextInt());

					System.out.println("contact updated succesfully");

					flag=true;



				}
			}

			else if(option == 3)
			{
				System.out.print("Enter the Contact Serial: ");

				int contactNo = sc.nextInt();

				if(contactNo <= contactNumber)
				{
				for(int l = 0 ; l < contactNumber ;l++)
				{
					if(contactNo == l+1 )
					{
						System.out.println("The Contact Details : " );

						System.out.println("Name : " + contact[l].getName());
						System.out.println("Phone Number : " + contact[l].getPhnNumber());



					}

					
				}

				}

				else 
				{
					System.out.println("This serial number is Invalid or dosen't exist that NO contact");
				}
				
			}

			else if(option == 4)
			{
				System.out.print("Enter the Contact Name you want to delete: ");

				sc.nextLine();

				String dltname = sc.nextLine();

				for(int k = 0 ; k< contactNumber ; k++)
				{
					if(dltname.equals(contact[k].getName()) )
					{
						

						contact[k].setName(null);
						contact[k].setPhnNumber(0);



					}

					
				}
			}

			else if(option == 5)
			{
				System.out.print("Enter the Contact Name: ");

				sc.nextLine();

				String name = sc.nextLine();

				for(int o = 0 ; o < contactNumber ; o++)
				{
					if(name.equals(contact[o].getName()) )
					{
						System.out.println("The Contact Details : " );

						System.out.println("Name : " + contact[o].getName());
						System.out.println("Phone Number : " + contact[o].getPhnNumber());



					}

					
				}

				

				
			}

			else if(option == 6)
			{
				System.out.print("Enter the Contact Number: ");


				int number = sc.nextInt();

				for(int m = 0 ; m < contactNumber ; m++)
				{
					if(number == contact[m].getPhnNumber())
					{
						System.out.println("The Contact Details : " );

						System.out.println("Name : " + contact[m].getName());
						System.out.println("Phone Number : " + contact[m].getPhnNumber());



					}

					
				}
			}

			else if(option == 7)
			{
				System.out.print("Enter the Contact Name: ");

				sc.nextLine();

				String Name = sc.nextLine();

				for(int n = 0 ; n < contactNumber ; n++)
				{
					if(Name.equals(contact[n].getName()) )
					{

						System.out.println("1.Update Name ");
						System.out.println("2.Update Number ");
						System.out.println("0.<- back");

						int optn = sc.nextInt();

						if(optn == 1)
						{
							System.out.println("Enter the new Name: ");

							sc.nextLine();

							contact[n].setName(sc.nextLine());

							System.out.println("\nContact Updated Successfully!!!!!" );

			
						}
						
						else if(optn == 2)
						{
							System.out.println("Enter the new Number : ");

						contact[n].setPhnNumber(sc.nextInt());


						System.out.println("\nContact Updated Successfully!!!!!" );

			
						}

						else if(optn == 0)
						{
							break;
						}
						
					}

					
				}
			}

			else if(option == 0)
			{
				break;
			}
		}





	}
}