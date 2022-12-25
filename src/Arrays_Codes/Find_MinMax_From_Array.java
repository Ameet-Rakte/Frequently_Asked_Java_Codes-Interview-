package Arrays_Codes;

import java.util.Arrays;

public class Find_MinMax_From_Array 
{
	int arr[]= {30,50,20,80,85,45,35};
	
	//Logic 01: By using enhanced for();
	public void Logic1()
	{
		System.out.println("The given array is :"+ Arrays.toString(arr));
		System.out.println("By using Logic 02:");
		int max= arr[0];

		for(int value:arr)
		{
			if(value>max)
			{
				max=value;
			}
		}
		System.out.println("The MaxElement from an array :"+max);
		
		int min= arr[0];
		for(int value:arr)
		{
			if(value<min)
			{
				min=value;
			}
		}
		System.out.println("The MinElement from an array :"+min);
	}
	
	//Logic 02: By using normal for();
	public void Logic2()
	{
		System.out.println("The given array is :"+ Arrays.toString(arr));
		System.out.println("By using Logic 02:");
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("The MaxElement from an array :"+max);

		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("The MinElement from an array :"+min);

	}

	public static void main(String[] args) 
	{
		Find_MinMax_From_Array minmax = new Find_MinMax_From_Array();
		
		//Call any logic method according to you..!!
		minmax.Logic2();

	}
}
