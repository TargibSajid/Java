import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            String s1 = sc.next(); //sc.next() for continue by pressing spcae button for that i can press space and procced to the next part 


            int a1 = sc.nextInt();

            sc.nextLine(); //it consume the the enter button 

            String s2 = sc.next();

            int a2 = sc.nextInt();

            sc.nextLine();

            String s3 =sc.next();

            int a3 = sc.nextInt();


            System.out.println("================================");
           
                
                System.out.printf("%-15s%03d\n",s1,a1);
                System.out.printf("%-15s%03d\n",s2,a2);
                System.out.printf("%-15s%03d\n",s3,a3);
          
            System.out.println("================================");

    }
}
