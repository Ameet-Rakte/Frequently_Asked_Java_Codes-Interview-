package Arrays_Codes;

import java.util.Arrays;
import java.util.Collections;

public class Sorting_Array_Using_Built_in_Methods 
{
	int array[] = {30,10,20,50,40,80,60};

	//Logic 01: By parallelSort() method;
	
	public void Logic1()
	{
		System.out.println("The array before sorting is :\n"+Arrays.toString(array));
		Arrays.parallelSort(array);
		
		System.out.println("The array after sorting is :\n"+ Arrays.toString(array));		
	}
	
	//Logic 02: By using sort() method;
	public void Logic2()
	{
		System.out.println("The array before sorting is :\n"+Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("The array after sorting is :\n"+ Arrays.toString(array));		
	}
	
	//Logic 03: Print the array in descending order;
	public void Logic3()
	{
		/*Important: 	1) We cannot use primitive data type(like-int, char) to reverse the array. We have to use derived data type(like-Integer)
						2) Primitive data types are the general and fundamental data types that we have in Java and those are byte, short, int, long, float, double, char, boolean . 
						3) Derived data types are those that are made by using any other data type for example, arrays. 
						4) User defined data types are those that user / programmer himself defines.
		*/
		
		Integer array[] = {30,10,20,50,40,80,60};

		System.out.println("The array before sorting is :\n"+Arrays.toString(array));
		Arrays.sort(array,Collections.reverseOrder());
		
		System.out.println("The array after sorting in descending order is :\n"+ Arrays.toString(array));		
	}

	public static void main(String[] args) 
	{
		Sorting_Array_Using_Built_in_Methods sort = new Sorting_Array_Using_Built_in_Methods();
		
		//Call any logic method according to you..!!
		sort.Logic2();
	}
}
