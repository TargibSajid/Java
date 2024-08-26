import java.util.*;

class Selection
{
	public static void main(String [] args)
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





		System.out.println("for selection sort");

		int n = 0 ;

		int h = 0;

		int k = 1 ;


		for(int i = 0 ; i < q ; i++)
		{

			n = arr[i];

			h = i ;

			

			for(int j = k ; j < q ; j++)
			{
				

				if(arr[j] < n )
				{
					n = arr[j];

					h = j;


				}
			}

			arr[h] = arr[i];

			arr[i] = n ;

			++k;

			
		}


		System.out.println("your sorted array is : ");

		for(int i = 0 ; i< q ; i++)
		{
			System.out.print(  arr[i] + " ");
		}







	}
}