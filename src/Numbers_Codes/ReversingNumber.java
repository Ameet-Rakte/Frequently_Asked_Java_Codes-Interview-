package Numbers_Codes;

import java.util.Scanner;

public class ReversingNumber 
{
	//Logic 01: Use StringBuffer
	public void Logic1()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = scan.nextInt();
		
		StringBuffer buffer = new StringBuffer(String.valueOf(num));
		StringBuffer rev = buffer.reverse();
		
		System.out.println("Number is reversed as :"+rev);
	}	
	
	//Logic 02: Use *, % & / Operators
	public void Logic2() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = scan.nextInt();
		
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
		System.out.println("Number is reversed as :"+rev);
		
	}

	public static void main(String[] args) 
	{
		ReversingNumber reverse = new ReversingNumber();
		
		//Call any logic method according to you..!!
		reverse.Logic1();

	}

}
