package Numbers_Codes;

import java.util.Scanner;

public class Factorial_Number 
{
	//Logic 01: For loop
	public void Logic1()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to find factorial :");
		int num = scan.nextInt();
		long factorial = 1;
		
		for(int i=1;i<=num;i++)
		{
			factorial = factorial*i;
		}
		System.out.println("Factorial of "+num+" is :"+factorial);
	}
	
	//Logic 02: Using while loop
	public void Logic2() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to find factorial :");
		int num = scan.nextInt();
		long factorial = 1;
		
		while(num!=1)
		{
			factorial=factorial*num;
			num++;
		}
		System.out.println("Factorial of "+num+" is :"+factorial);
		
	}
	
	public static void main(String[] args) 
	{
		Factorial_Number fact = new Factorial_Number();
		
		//Call any logic method according to you..!!
		fact.Logic1();

	}

}
