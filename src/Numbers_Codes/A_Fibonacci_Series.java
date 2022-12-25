package Numbers_Codes;

import java.util.Scanner;

public class A_Fibonacci_Series 
{
	// Logic 01: By using while loop and given the range.
	public void Logic1()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number until the Fibonacci series must be implemented :");
		int num = scan.nextInt();
		
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.print(a+" "+b);
		
		while(c<num)
		{
			c = a+b;
			System.out.print(" "+c);
			
			a=b;
			b=c;
		}
	}

	// Logic )2: By using for loop and given the iteration limit.
	public void Logic2() 
	{
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.print(a+" "+b);
		
		for(int i=2; i<10;i++)
		{
			c = a+b;
			System.out.print(" "+c);
			
			a=b;
			b=c;	
		}

	}
	public static void main(String[] args) 
	{
		A_Fibonacci_Series series = new A_Fibonacci_Series();
		series.Logic1();

	}

}
