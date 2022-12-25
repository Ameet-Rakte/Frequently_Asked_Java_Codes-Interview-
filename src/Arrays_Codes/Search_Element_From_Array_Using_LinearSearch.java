package Arrays_Codes;

import java.util.Arrays;
import java.util.Scanner;

public class Search_Element_From_Array_Using_LinearSearch 
{
	int array[] = {10, 20, 30, 40, 50, 60};
	
	//Logic 01:
	public void Logic1() 
	{
		System.out.println("The given array is :"+ Arrays.toString(array));
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number you want to search in the array:");
		int search = scan.nextInt();
		boolean flag = false;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==search)
			{
				System.out.println("Element found in an Array!");
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Element Not found in an Array!");
		}	
	}
	
	public static void main(String[] args) 
	{
		Search_Element_From_Array_Using_LinearSearch search = new Search_Element_From_Array_Using_LinearSearch();
		search.Logic1();
	}
}
