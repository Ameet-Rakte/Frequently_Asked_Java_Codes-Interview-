package Arrays_Codes;
import java.util.*;

public class Search_Element_From_Array_Using_BinarySearch 
{
	
	//Important : In binary search, the array must be in sorted order.
	//Logic 01 : By finding the middle element then use 3 cases; i) mid==key, ii) mid<=key [l=mid+1], iii) mid>==key[h=mid-1]
	
	int array[] = {10,20,30,40,50,60,70,80,90};
	
	public void Logic1() 
	{
		System.out.println("The given array is :"+ Arrays.toString(array));
		System.out.println("By using Logic 01:");
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the element you want to search : ");
		int key = scan.nextInt();
		
		boolean flag = false;
		
		int l = 0;
		int h = array.length-1;
		
		while(l<=h)
		{
			int mid = (l+h)/2;
			
			if(array[mid]==key) // Case i) mid==key;
			{
				System.out.println("Operation success, Element found :)");
				flag=true;
				break;
			}
			if(array[mid]<key) // Case ii) mid<=key [l=mid+1];
			{
				l = mid+1;
			}
			if(array[mid]>key) // Case iii) mid>==key[h=mid-1];
			{
				h = mid-1;
			}
		}
		if(flag==false)
		{
			System.out.println("Operation failed, Element not found :( ");
		}		
	}
	
	//Logic 02 : To find the index of the element to be searched;
	
	public void Logic2()
	{
		System.out.println("The given array is :"+ Arrays.toString(array));
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the element you want to search : ");
		int key = scan.nextInt();
		
		int index = Arrays.binarySearch(array, key);
		System.out.println("The index of array["+key+"] is :"+index);
		
	
	}

	public static void main(String[] args) 
	{
		Search_Element_From_Array_Using_BinarySearch search = new Search_Element_From_Array_Using_BinarySearch();
		
		//Call any logic method according to you..!!
		search.Logic2();
	}
}
