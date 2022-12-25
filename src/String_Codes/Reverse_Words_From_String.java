package String_Codes;

import java.util.Scanner;

public class Reverse_Words_From_String 
{
	//Logic 01: By using for()
	public void Logic1()
	{
		System.out.println("By using Logic 01:");

		Scanner scan = new Scanner(System.in);
		System.out.println("Please your statement :");
		String stmt = scan.nextLine();
		
		//Step 1: Use built in method for splitting string into the set of words;
		String[] words = stmt.split(" ");
		String reverseString = " ";
		
		for(String value:words)
		{
			String reverseWord = " ";
			for(int i=value.length()-1;i>=0;i--)
			{
				reverseWord = reverseWord+value.charAt(i);
			}
			reverseString = reverseString+reverseWord+" ";
		}
		System.out.println("The reversed statement is : "+reverseString);	
	}
	
	//Logic 02: By using StringBuilder
	public void Logic2()
	{
		System.out.println("By using Logic 02:");
		Scanner scan = new Scanner(System.in);
		System.out.println("Please your statement :");
		String stmt = scan.nextLine();
		
		//Step 1: Use built in method for splitting string into the set of words;
		String[] words = stmt.split(" ");
		String reverseString = " ";
		
		for(String word:words)
		{
			StringBuilder sb = new StringBuilder(word);
			sb.reverse();
			
			reverseString=reverseString+sb.toString()+" ";
		}
		System.out.println("The reversed statement is : "+reverseString);	
	}
	public static void main(String[] args) 
	{
		Reverse_Words_From_String reverse = new Reverse_Words_From_String();
		
		//Call any logic method according to you..!!
		reverse.Logic2();
	}
}
