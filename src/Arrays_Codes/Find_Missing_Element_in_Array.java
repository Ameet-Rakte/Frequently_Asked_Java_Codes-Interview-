package Arrays_Codes;

import java.util.Arrays;

public class Find_Missing_Element_in_Array 
{
	int arr[]= {1,2,3,5,6,7};

	//Logic 01: By using the difference between sum of elements in an array and the sum of range of elements in an array.
	public void Logic1()
	{
		System.out.println("The given array is :"+ Arrays.toString(arr));
		int sum1 = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum1 = sum1+arr[i];
		}
		System.out.println("Sum of elements in an array \t\t:"+sum1);
		
		int sum2 = 0;
		for(int i=1;i<=7;i++)
		{
			sum2 = sum2+i;
		}
		System.out.println("Sum of range of elements in an array \t:"+sum2);
		
		System.out.println("The missing number in an Array is \t:" + (sum2-sum1));
	}
	
	
	
	public static void main(String[] args) 
	{
		Find_Missing_Element_in_Array find = new Find_Missing_Element_in_Array();
		find.Logic1();		
	}

}
