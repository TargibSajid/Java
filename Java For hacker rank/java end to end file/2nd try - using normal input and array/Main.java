import java.util.*;

class Main 
{
	public static void main ( String [] args)
	{
		Scanner sc = new Scanner(System.in);

		int i = 0;

		boolean b1 = true;

		String input[] = new String[100];

		while(b1 == true)
		{
			String test = sc.nextLine();

			if(test == "")
			{
				b1 = false;
			}
			else {

					 input[i] = test;
				
			i++;
			}			
		}

		

		boolean b2 = true;

		for(int j = 0 ; b2 == true  ; j++)
		{
			String s = null;

			if(input[j] != null)
			{
				s = input[j];

				if(s!= null)
					{
						System.out.println((j+1) + " " + s);
					}

				
			}

			else if( input[j] == null)
			{

				

				b2 = false ;
				break;
			}


			
		}
	}
}