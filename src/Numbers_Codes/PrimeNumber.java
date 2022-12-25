package Numbers_Codes;

import java.util.Scanner;

public class PrimeNumber 
{
	//Logic 01: Using loops.
	public void Logic1()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to validate:");
		int num = scan.nextInt();
		int count=0;
		//Prime number must be greater than 1.
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				count++;
			}
			if(count==2)
			{
				System.out.println(num+" is a Prime number :)");
			}
			else
			{
				System.out.println(num+" is not a Prime number :(");
			}
		}		
		else
		{
			System.out.println(num+" is not a Prime number :(");
		}
	}
	
	public static void main(String[] args) 
	{
		PrimeNumber prime = new PrimeNumber();
		
		//Call any logic method according to you..!!
		prime.Logic1();
	}
}
