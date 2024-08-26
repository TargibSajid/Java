public class Child extends Parent
{
	private String id;

	Child()
	{
		System.out.println("Empty Construstor");
	}

	Child(String name,int age,String id)
	{
		super(name,age);

		this.id = id;
	}

	public void setID(String id)
	{
		this.id = id;

	}

	public String getID()
	{
		return id;
	}

	 public String getName()
	{
		System.out.println("HI");

		return  name(); // explained in parent 49 line
	}

	public void setname(String name)
	{
		setName(name);     // can not input directly in parent class attribute when it is in private that why we have to use a parent class method to do this work ....and cannot override bcz what it will return is in private (name attribute) 

	}

	public int getAge()
	{
		System.out.println("h");
		return age;
	}

}