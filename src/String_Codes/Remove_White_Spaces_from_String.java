package String_Codes;

public class Remove_White_Spaces_from_String 
{
	// Logic 01: By using regular expression (regex);
	public void Logic1()
	{
		String str1 = "He		llo		Amit    R			akte      welco			ming           you!";
		System.out.println("String before removing the White Spaces:\n"+str1);

		String neat = str1.replaceAll("\\s", "");
		System.out.println("String after removing the White Spaces:\n"+neat);
	}

	public static void main(String[] args) 
	{
		Remove_White_Spaces_from_String remove = new Remove_White_Spaces_from_String();
		remove.Logic1();
	}
}
