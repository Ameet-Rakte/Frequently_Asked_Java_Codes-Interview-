package Arrays_Codes;

import java.util.Arrays;

public class Sorting_Array_Using_Buble_Sort 
{
	/* Important : 	1) Bubble sorting technique is used to sort the element by comparing initial element with next element.
	 				2) This technique operates on (array_size - 1) passes.
	 				3) If the initial element is greater than next then only swapping will be done.
	 * */
	
	int array[] = {30,10,20,50,40,80,60};
	int pass=0;
	
	// Logic 01 : By using + & - operator;
	
	public void Logic1()
	{
		System.out.println("By using Logic 01:");

		System.out.println("The array before sorting is :"+ Arrays.toString(array));
		for(int i=0;i<array.length-1;i++) // Number of passes to be done;
		{
			for(int j=0;j<array.length-1;j++) // Number of iteration to compare the elements;
			{ pass++;
				if(array[j]>array[j+1]) 
				{
					array[j]=array[j]+array[j+1];
					
					array[j+1]=array[j]-array[j+1];
					array[j]=array[j]-array[j+1];
					System.out.println("\tPass :"+pass+""+Arrays.toString(array));
				}
			}
		}
		System.out.println("The array after sorting is :"+ Arrays.toString(array));		
	}
	
	// Logic 01 : By using third variable;
	
		public void Logic2()
		{
			System.out.println("By using Logic 02:");
			System.out.println("The array before sorting is :"+ Arrays.toString(array));
			
			for(int i=0;i<array.length-1;i++) // Number of passes to be done;
			{
				for(int j=0;j<array.length-1;j++) // Number of iteration to compare the elements;
				{
					pass++;
					if(array[j]>array[j+1]) 
					{
						int temp = array[j];
						array[j] = array[j+1];
						array[j+1] = temp;
						System.out.println("\tPass :"+pass+""+Arrays.toString(array));
					}
				}
			}
			System.out.println("The array after sorting is :"+ Arrays.toString(array));		
		}
	 
	public static void main(String[] args) 
	{
		Sorting_Array_Using_Buble_Sort sort = new Sorting_Array_Using_Buble_Sort();
		
		//Call any logic method according to you..!!
		sort.Logic1();
	}
}
