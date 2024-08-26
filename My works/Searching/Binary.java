import java.util.*;

class Binary
{
	public static void main (String [] args)
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

		System.out.println();



		int v = 0 ;



		


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



		System.out.print("Enter the value you want to found  : ");

		int value = sc.nextInt();

		int f = 0 ;

		int l = q-1 ;

		int m = (f+l)/2;

		while(true)
		{

				if(arr[m] ==  value )
								{
									System.out.println("The value is found " + arr[m]);

									break ;
								}

				else if(arr[m] > value)
						{

							l = m-1;

						}

				else if(arr[m] < value )
				{
					 f = m+1; 
				}


				 m = (f+l)/2;




		}



	}
}