package Arrays_Codes;

public class Find_Even_Odd_From_Array 
{
	int array[] = {1,2,3,4,5,6,7,8,9};
	
	//Logic 01: By using normal for();
	public void Logic1() 
	{
		System.out.println("By using Logic 01:");
		
		System.out.println("The set of Even numbers in an array is \t:");
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2==0)
			{
				System.out.println(array[i]);
			}
		}
		System.out.println("The set of Odd numbers in an array is \t:");
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2!=0)
			{
				System.out.println(array[i]);
			}
		}
	}
	
	//Logic 01: By using Enhanced for();
	public void Logic2()
	{
		System.out.println("By using Logic 02:");
		
		System.out.println("The set of Even numbers in an array is \t:");
		for(int value:array)
		{
			if(value%2==0)
			{
				System.out.println(value);
			}
		}
		
		System.out.println("The set of Odd numbers in an array is \t:");
		for(int value:array)
		{
			if(value%2!=0)
			{
				System.out.println(value);
			}
		}	
	}
	
	public static void main(String[] args)
	{
		Find_Even_Odd_From_Array find = new Find_Even_Odd_From_Array();
		
		//Call any logic method according to you..!!
		find.Logic2();	
	}
}
