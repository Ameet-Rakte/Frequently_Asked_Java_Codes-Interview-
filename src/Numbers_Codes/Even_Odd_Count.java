package Numbers_Codes;

import java.util.Scanner;

public class Even_Odd_Count {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scan.nextInt();
		
		int even_count = 0;
		int odd_count = 0;	
		
		while(num!=0) // (num>0)
		{
			int reminder = num%10;
			
			if(reminder%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
			
			num = num/10;
		}
		System.out.println("Even count is :"+even_count);
		System.out.println("Odd count is :"+odd_count);
	}

}
