import java.util.*;

class Bubble

{
	public static void main (String [] args )
	{
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[10];


		System.out.println("Enter the values "); 


		for(int i = 0 ; i < 10 ; i ++)
		{
			arr[i] = sc.nextInt();

		}

		int k = 0;

		int l = 9;

		System.out.println("for bubble sort");

		for(int pass = 0 ; pass < 10 ; pass++)
		{
			for(int i = 0 ; i < l ; i++)
		{
			if(arr[i] > arr[i+1])
			{

				k = arr[i];

				arr[i] = arr[i+1];

				arr[i+1] =  k ; 



			}


		}

		--l;

		}


		System.out.println("your sorted array is : ");

		for(int i = 0 ; i< 10 ; i++)
		{
			System.out.print(  arr[i] + " ");
		}




		
		
	}
}