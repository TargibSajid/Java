public class Contact
{
	private String name;

	private int phnNumber;

	Contact()
	{

	}

	Contact(String name , int phnNumber)
	{
		this.name = name;

		this.phnNumber = phnNumber;
	}

	void setName(String name)
	{
		this.name = name;
	}

	void setPhnNumber(int phnNumber)
	{
		this.phnNumber = phnNumber;
	}

	String getName()
	{
		return name;
	}

	int getPhnNumber()
	{
		return phnNumber;
	}

	
}