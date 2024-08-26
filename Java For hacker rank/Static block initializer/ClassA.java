import java.util.*;

class ClassA 
{
	static 
	{
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int b = sc.nextInt();

		if(h <= 0 || b <= 0)
		{
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
		else
		{
			System.out.println(b*h);
		}
	}
}