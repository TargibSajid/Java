import java.util.Scanner;

class Main
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		int a,b,n,q;


		q = sc.nextInt();

		for(int i = 0 ; i < q ; i++)
		{
			a = sc.nextInt();
			b = sc.nextInt();
			n = sc.nextInt();

			int sum = a + 1*b;
			int x = 2;

			for(int j = 0 ; j<n ; j++)
			{
				System.out.print(sum + " ");
				

				sum = sum + x*b;

				

				x = x*2;
			}
			System.out.print("\n");


		}



	}
}