package Arrays_Codes;

import java.util.Arrays;

public class Equal_Array_Comparison 
{
	int arr1[]= {1,2,3,4};
	int arr2[]= {1,2,3,4};
	
	
	//Logic 01: By using Arrays.equals() method.
	public void Logic1()
	{
		System.out.println("By using logic 01 :");
		boolean status = Arrays.equals(arr1, arr2);
		if(status==true)
		{
			System.out.println("Given arrays are equal.");
		}
		else
		{
			System.out.println("Given arrays are not equal.");
		}
	}

	//Logic 02: By using loop.
	public void Logic2()
	{
		System.out.println("By using logic 02 :");
		boolean status=true;
		
		if(arr1.length == arr2.length)
		{
			for(int i=0; i<arr1.length;i++)
			{
				if(arr1[i] != arr2[i])
				{
					status=false;
				}
			}
		}
		else
		{
			status=false;
		}
		
		if(status==true)
		{
			System.out.println("Given arrays are equal.");
		}
		else
		{
			System.out.println("Given arrays are not equal.");
		}
		
	}
	public static void main(String[] args) 
	{
		Equal_Array_Comparison equal= new Equal_Array_Comparison();
		
		//Call any logic method according to you..!!
		equal.Logic2();
	}

}
