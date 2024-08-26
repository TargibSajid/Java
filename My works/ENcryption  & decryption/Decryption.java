import java.util.*;

class Decryption
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner (System.in);


		char alphabet[] = new char[26];

		alphabet[0]='a';
		alphabet[1] = 'b';
		alphabet[2] = 'c';
		alphabet[3] = 'd';
		alphabet[4] = 'e';
		alphabet[5] = 'f';
		alphabet[6] = 'g';
		alphabet[7] = 'h';
		alphabet[8] = 'i';
		alphabet[9] = 'j';
		alphabet[10] = 'k';
		alphabet[11] = 'l';
		alphabet[12] = 'm';
		alphabet[13] = 'n';
		alphabet[14] = 'o';
		alphabet[15] = 'p';
		alphabet[16] = 'q';
		alphabet[17] = 'r';
		alphabet[18] = 's';
		alphabet[19] = 't';
		alphabet[20] = 'u';
		alphabet[21] = 'v';
		alphabet[22] = 'w';
		alphabet[23] = 'x';
		alphabet[24] = 'y';
		alphabet[25] = 'z';
		

		System.out.print("Enter a message is alredy encrypted  : " );

		String input = sc.nextLine();

		System.out.println("Your decrypted code is : ");

		int strlength = input.length();



		char inputChar[] = new char[strlength];

		for(int i = 0 ; i < strlength ; i++)
		{
			inputChar[i] = input.charAt(i);
		}


	  for(int i = 0 ; i < strlength ; i++)
	  {
	  	for (int j = 0; j < 26 ; j ++)
		{
			if(alphabet[j] == inputChar[i])
			{
				int l = (j-3)%26;
				System.out.print(alphabet[l]);
			}

			else if(inputChar[i] == ' ')
			{
				System.out.print(" ");
				break;
			}
		}

	  }
		
	}
}