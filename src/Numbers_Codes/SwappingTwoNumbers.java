package Numbers_Codes;

public class SwappingTwoNumbers 
{

	int a=10;
	int b=20;
	
	//Logic 01: Use Third Variable
	public void Logic1()
	{
		System.out.println("Values of a & b before swapping are: a="+a+" & b="+b);
		
		int t=a;
		a=b;
		b=a;
		
		System.out.println("Values of a & b After swapping are: a="+a+" & b="+b);
		
	}
	//Logic 02: Use + & - Operators
	public void Logic2()
	{		
		System.out.println("Values of a & b before swapping are: a="+a+" & b="+b);
	
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Values of a & b After swapping are: a="+a+" & b="+b);
	
		
	}
	
	//Logic 03: Use * & / Operator
	public void Logic3()
	{
		System.out.println("Values of a & b before swapping are: a="+a+" & b="+b);
		
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println("Values of a & b After swapping are: a="+a+" & b="+b);	
		
	}
	
	//Logic 04: By using single statement.
	public void Logic4()
	{
		System.out.println("Values of a & b before swapping are: a="+a+" & b="+b);

		b=a+b-(a=b);
		
		System.out.println("Values of a & b After swapping are: a="+a+" & b="+b);	

	}
	
	public static void main(String[] args) 
	{
		SwappingTwoNumbers swap = new SwappingTwoNumbers();
		
		//Call any logic method according to you..!!
		swap.Logic1();

	}

}
