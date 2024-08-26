import java.util.*;

class Insertion
{
	public static void main (String [] args ) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the elements numbers : ");

		int q = sc.nextInt();


		int arr[] = new int[q];


			System.out.println("Enter the values "); 


		for(int i = 0 ; i < q ; i ++)
		{
			arr[i] = sc.nextInt();

		}


	for(int i = 0 ; i < q ; i ++)
		{
			System.out.print(arr[i] + " ");

		}



		int v = 0 ;



		System.out.println("for Insertion sort");


		for(int i = 1 ; i < q ; i++)
		{
			v = arr[i];

			for(int j = i-1 ; j >= 0 ; j--)
			{
				if(v < arr[j])
				{

					
					arr[j+1] = arr[j] ;

					arr[j] = v ;
				
				}

				else 
				{
					break;
				}
			}

		}



		System.out.println("your sorted array is : ");

		for(int i = 0 ; i < q ; i ++)
		{
			System.out.print(arr[i] + " ");
		}

	}
}