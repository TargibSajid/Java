import java.io.*;
import java.util.*;

class Main
{
	public static void main (String [] args)
	{
		Scanner sc  = new Scanner (System.in);
		File f = new File("sajid.txt");

		try {

			

			f.createNewFile();
		}

		catch (Exception io)
		{
			System.out.println(" An Error occurd while creating a file ");
		}


		FileWriter fw  = null;

		try{

			fw = new FileWriter ("sajid.txt",true);

			String str = null;
			String string = null;

			while(true )
			{
				str = sc.nextLine();

				if(str.isEmpty())
				{
					break;
				}

				
			


			fw.write(str+ "\n");
		}

			}

			

		catch(Exception i)
		{
			System.out.println("An Error occurd while writing the file ");

		}

		finally
		{
			try 
			{
				fw.close();
			}

			catch(Exception e)
			{
				System.out.println("An error occurded while closing the file ");
			}
		}

		FileReader fr = null ;

		try 
		{
			fr = new FileReader(f);
			

			BufferedReader br = new BufferedReader(fr);

			for(int i = 1 ; i < f.length() ; i++ )
			{
				String line = br.readLine();	

				if(line != null)
				{
					System.out.println( i +" " + line);
				}


			}
		}

		catch(Exception eo)
		{
			System.out.println("Error occured while reading the file ");
		}
	}


}