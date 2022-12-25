package String_Codes;

import java.util.Scanner;

public class Find_Number_of_Words_in_String 
{
	public void Logic1()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please your statement :");
		String stmt = scan.nextLine();
		int count = 1;

		for(int i=0;i<stmt.length()-1;i++)
		{
			if((stmt.charAt(i)==' ') && (stmt.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println("The number of words in the statement are :"+count);
	}

	public static void main(String[] args) 
	{
		Find_Number_of_Words_in_String find = new Find_Number_of_Words_in_String();
		find.Logic1();
	}
}
