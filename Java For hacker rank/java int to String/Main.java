import java.util.*;

class Main
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		String s = Integer.toString(a);

		System.out.println(s);

		if(!s.equals(null))
		{
			System.out.println("Good job");
		}

		else if(s.equals(null))
		{
			System.out.println("Wrong answer");
		}

	}
}