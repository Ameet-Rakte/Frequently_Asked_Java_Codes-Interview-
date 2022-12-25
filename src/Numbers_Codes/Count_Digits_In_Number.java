package Numbers_Codes;

import java.util.Scanner;

public class Count_Digits_In_Number {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = scan.nextInt();
		
		int count=0;
		
		while(num!=0) // (num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("The number of digits in the given number is : "+count);

	}

}
