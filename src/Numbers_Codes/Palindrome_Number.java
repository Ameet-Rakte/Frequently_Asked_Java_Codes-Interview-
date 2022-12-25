package Numbers_Codes;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		
		int num=scan.nextInt();
		int user_num=num;
		
		int reversed_num=0;
		
		while(num!=0)
		{
			reversed_num = reversed_num*10 + num%10;
			num = num/10;
		}
		if(reversed_num==user_num)
		{
			System.out.println(user_num+ " is a palindrome number.");
		}
		else
		{
			System.out.println(user_num+ " is not a palindrome number");
		}

	}

}
