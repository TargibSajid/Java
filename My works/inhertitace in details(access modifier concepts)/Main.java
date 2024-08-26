public class Main 
{
	public static void main(String [] args)
	{
		Parent c1 = new Child("sajid",10,"23-51332-1");

		System.out.println(c1.getName());

		Parent p1 = new Parent("jasim",60);

		System.out.println(p1.getName());

		c1.setName("uncle");

		System.out.println(p1.set());

		c1.details();
	}
}