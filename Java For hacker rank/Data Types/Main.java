import java.util.*;


class Main
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		long a  = 0; // before entring to a loop you have to initialize it incase of any error by the loop

		for(int i = 0 ; i < t ; i++)
		{
			try 
			{
				a = sc.nextLong();
				System.out.println( a + " can be fitted in:");

				if( a <=  127 && a >= -128 )
			{
				System.out.println("* byte");
				System.out.println("* short");
				System.out.println("* int");
				System.out.println("* long");


			}

			else if(a <=  32767&& a >= -32768)
			{
				System.out.println("* short");
				System.out.println("* int");
				System.out.println("* long");

			}

			else if( a <=   2147483647 && a >= -2147483648)
			{
				System.out.println("* int");
				System.out.println("* long");	
			}
			else 
			{
				System.out.println("* long");
			}

			}

			catch(Exception io)
			{
				System.out.println( sc.next() + " can't be fitted anywhere."); //sc.next() consume the large number that can't store in nextLong() 
				
				
			}



		}
	}	
		
}