public class Parent
{
	private String name;  //onky accessable in this class 

	protected int age;		//ONLY CAN ACCESSABLE by the sub class 

	Parent()
	{
		System.out.println("Empty Constructor");
	}

	Parent(String name,int age)
	{
		System.out.println("Peremeterized Constructor");

		this.name = name;

		this.age = age;


	}

	public void setName(String name)
	{
		this.name = name;
	}


	public void setAge(int age)
	{
		this.age = age;
	}

	private int getAge()
	{
		return age;
	}

	public String getName()
	{
		return name;
	}

	public int set()        // private methods have to get access through another public method 
	{
		return getAge();
	}

	public String name()    // used it bcz name is in privvate by using this method child class ovverride method can still get the name by using this method of parent class
	{
		return name;
	}

	public void details()
	{
		System.out.println(name);
		System.out.println(age);
	}


}