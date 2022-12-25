package String_Codes;

import java.util.Scanner;

public class ReverseString 
{
	//Logic 01: Using concatination of the reverse string (rev)
	public void Logic1()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = scan.next();
		String rev = "";
		int len = str.length();
		
		for(int i = len-1; i>=0; i--)
		{
			rev = rev+str.charAt(i);
		}
		System.out.println("Reversed String :"+rev);
	}
	
	//Logic 02: Use character array
	public void Logic2()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = scan.next();
		String rev = "";
		
		char arr[] = str.toCharArray();
		int len = arr.length;
		for(int i = len-1; i>=0; i--)
		{
			rev = rev+arr[i];
		}
		System.out.println("Reversed String :"+rev);
	}

	public static void main(String[] args) 
	{
		ReverseString reverse = new ReverseString();
		
		//Call any logic method according to you..!!
		reverse.Logic2();
	}
}
