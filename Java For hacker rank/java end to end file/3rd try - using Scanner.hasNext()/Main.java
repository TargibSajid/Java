import java.util.*;
import java.io.*;

class Main
{
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);

        try {
            File file = new File("example.txt");

            file.createNewFile();

            

            FileWriter fw = new FileWriter(file,true);

            while(sc.hasNextLine())
            {
            	String write = sc.nextLine();

            	fw.write( write + "\n" );

            	if(write == "")
            	{
            		break;
            	}




            }

            fw.close();

            
            Scanner scanner = new Scanner(file);

            for(int i = 1 ;scanner.hasNextLine();i++) {
                String content = scanner.nextLine();
                System.out.println(i + " " +content);
            }

           
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}