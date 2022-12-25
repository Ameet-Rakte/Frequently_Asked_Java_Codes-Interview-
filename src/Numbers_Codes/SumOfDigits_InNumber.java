package Numbers_Codes;

import java.util.Scanner;

public class SumOfDigits_InNumber {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = scan.nextInt();
		int sum = 0;
		while(num!=0)
		{
			int remainder = num%10;
			
			sum = sum + remainder;
			
			num = num/10;
		}
		System.out.println("The sum of digits in number is :"+sum);

	}

}
