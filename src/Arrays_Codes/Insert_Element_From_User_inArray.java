package Arrays_Codes;

import java.util.Scanner;

public class Insert_Element_From_User_inArray 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of elements in array to be stored \t:");
		int size = scan.nextInt();
		
		int array[]= new int[size];
		System.out.println("Enter the elements you want to store \t:");
		for(int i=0;i<size;i++)
		{
			array[i] = scan.nextInt();
		}
	
		System.out.print("The array is\t:{");
		for(int i=0;i<size;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.print("}");
	}
}
