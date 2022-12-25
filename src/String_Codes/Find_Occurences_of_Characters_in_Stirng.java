package String_Codes;
import java.util.Scanner;

public class Find_Occurences_of_Characters_in_Stirng 
{
	String str = "Welcome to Bootcamp with Amit!";
	
	//Logic 01: By finding the length of strings;
	public void Logic1()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character of which you want to find occurances :");
		String ch = scan.next();
			
		// Step 1: Find the length of real string;
		int length =  str.length();
		
		// Step 2: Find the length of string after replacing the character of which you need a count;
		int occurences = str.replace(ch, "").length();
		
		//Step 3: Find the difference between the lengths and make it as a count;
		int count = length - occurences;		
		System.out.println("The occurances of ["+ch+"] is :"+count);
	}

	public static void main(String[] args) 
	{
		Find_Occurences_of_Characters_in_Stirng find = new Find_Occurences_of_Characters_in_Stirng();
		find.Logic1();
	}
}
