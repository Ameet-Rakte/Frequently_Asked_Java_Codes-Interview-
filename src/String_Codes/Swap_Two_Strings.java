package String_Codes;
import java.util.Scanner;

public class Swap_Two_Strings 
{
	//Logic 01:
	public void Logic1()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first string :");
		String str1 = scan.next();
		System.out.println("Enter your Second string :");
		String str2 = scan.next();		
		
		System.out.println("By using logic 01:");
		System.out.println("Strings before swapping are \t:"+str1+" "+str2);
		
		str1 = str1+str2; //AmitRakte
		
		str2 = str1.substring(0, (str1.length() - str2.length()));
		str1 = str1.substring((str2.length()));
		
		System.out.println("Strings After swapping are \t:"+str1+" "+str2);
	}

	public static void main(String[] args) 
	{
		Swap_Two_Strings swap = new Swap_Two_Strings();
		swap.Logic1();
	}
}