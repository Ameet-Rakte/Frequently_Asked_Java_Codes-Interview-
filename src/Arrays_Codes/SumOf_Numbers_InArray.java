package Arrays_Codes;

import java.util.Arrays;

public class SumOf_Numbers_InArray 
{
	int array[]= {1,2,3,4,5,6};
	int sum = 0;
	
	//Logic 01: Using for loop.
	public void Logic1()
	{
		System.out.println("The given array is :"+ Arrays.toString(array));
		for(int i=0;i<=array.length-1;i++)
		{
			sum=sum+array[i];
		}
		System.out.println("By using Logic1():");
		System.out.println("Sum of the elements in array is :"+sum);		
	}
	
	//Logic 02: Using Enhanced for loop.
	public void Logic2()
	{
		System.out.println("The given array is :"+ Arrays.toString(array));

		for(int value:array)
		{
			sum=sum+value;
		}
		System.out.println("By using Logic2():");
		System.out.println("Sum of the elements in array is :"+sum);		
	}

	public static void main(String[] args) 
	{
		SumOf_Numbers_InArray arr = new SumOf_Numbers_InArray();
		
		//Call any logic method according to you..!!
		arr.Logic1();
	}
}
