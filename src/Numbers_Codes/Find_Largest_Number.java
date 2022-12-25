package Numbers_Codes;
import java.util.Scanner;

public class Find_Largest_Number 
{
	//Logic 01: by using comparison operator.
	public void Logic1() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print(" Enter the First Number :\t");
		int num1 = scan.nextInt();
		System.out.print(" Enter the Second Number :\t");
		int num2 = scan.nextInt();
		System.out.print(" Enter the Third Number :\t");
		int num3 = scan.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("First number, "+num1+", is the largest number.");
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println("Second number, "+num2+", is the largest number.");
		}
		else
		{
			System.out.println("Third number, "+num3+", is the largest number.");
		}
	}
	
	
	//Logic 02: by using ternary operator
	public void Logic2()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print(" Enter the First Number :\t");
		int num1 = scan.nextInt();
		System.out.print(" Enter the Second Number :\t");
		int num2 = scan.nextInt();
		System.out.print(" Enter the Third Number :\t");
		int num3 = scan.nextInt();
		
		//a>b?a:b;
		int largest = num3>(num2>num1?num2:num1)?num3:(num2>num1?num2:num1);
		System.out.println(largest+", is the largest number.");
	}
	
	public static void main(String[] args) 
	{
		Find_Largest_Number largest = new Find_Largest_Number();

		//Call any logic method according to you..!!
		largest.Logic2();
	}
	

}
