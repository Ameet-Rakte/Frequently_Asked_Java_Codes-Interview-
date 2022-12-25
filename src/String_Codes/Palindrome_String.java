package String_Codes;

import java.util.Scanner;

public class Palindrome_String 
{

	//Logic 01: By using StringBuffer
	public void Logic1()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String str = scan.next();
		
		String org_str = str;
		
		StringBuffer buffer = new StringBuffer(str);
		StringBuffer rev = buffer.reverse();
		
		String rev_str = String.valueOf(rev);
		
		if(org_str.equals(rev_str))
		{
			System.out.println(org_str+" is a palindrome string.");
		}
		else
		{
			System.out.println(org_str+" is not a palindrome string.");
			
		}
	}
	
	//Logic 02: Using String Length - str.length();
	public void Logic2()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = scan.next();
		String org_str = str;
		
		String rev_str = "";
		int len = str.length();
		
		for(int i = len-1; i>=0; i--)
		{
			rev_str = rev_str+str.charAt(i);

		}
		System.out.println("Reversed String :"+rev_str);
		
		if(org_str.equals(rev_str))
		{
			System.out.println(org_str+" is a palindrome string.");
		}
		else
		{
			System.out.println(org_str+" is not a palindrome string.");

		}
	}
	public static void main(String[] args) 
	{
		Palindrome_String palindrome = new Palindrome_String();
		
		//Call any logic method according to you..!!
		palindrome.Logic1();		
	}
}
