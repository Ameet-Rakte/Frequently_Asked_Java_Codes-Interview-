package String_Codes;

public class Remove_Junk_or_Special_Characters_from_String 
{
	// Logic 01: By using regular expression (regex);
	public void Logic1()
	{
		String str1 = "@$#^ Am(&%^it $&%#&*(R)*^&^%akte*";
		
		String pure_string = str1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("String after removing the junks:\t"+pure_string);
	}

	public static void main(String[] args) 
	{
		Remove_Junk_or_Special_Characters_from_String remove = new Remove_Junk_or_Special_Characters_from_String();
		remove.Logic1();

	}
}
