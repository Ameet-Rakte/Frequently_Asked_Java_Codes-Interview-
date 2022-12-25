package Arrays_Codes;

import java.util.HashSet;

public class Find_Duplicates_from_Array 
{
	int arr[]= {2,4,3,5,6,9,5};
	int duplicate=0;
	boolean flag=false;
	
	//Logic 01: By using nested for();
	public void Logic1()
	{
		System.out.println("By using logic 01:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					duplicate=arr[i];
					flag=true;
				}
			}	
		}
		if(flag==true)
		{			
			System.out.println("The duplicate elements from the array is \t:"+duplicate);
		}
		else
		{
			System.out.println("Duplicate element not found!");
		}		
	}
	
	//Logic 02: By using Hasshset(); Hashset does not allow duplicate elements
	
	public void Logic2() 
	{
		System.out.println("By using Logic 02:");
		HashSet <Integer> hash = new HashSet<>();
		boolean flag= false;
		
		
		for(int value:arr)
		{
			if(hash.add(value)==false)// if there is duplicate element in hashset, then it gives false value.
			{
				System.out.println("The duplicate elements from the array is \t:"+value);
				flag = true;
			}
		}
		if(flag==false)
		{
			System.out.println("Duplicate element not found!");
		}
	}

	public static void main(String[] args) 
	{
		Find_Duplicates_from_Array find = new Find_Duplicates_from_Array();
		
		//Call any logic method according to you..!!
		find.Logic2();
	}
}
