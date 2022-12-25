package TextFile;
import java.io.*;

public class Write_The_Data_In_TextFile 
{
	//Logic 01: 
	public void Logic1() throws IOException
	{
		FileWriter fw = new FileWriter("C:\\Users\\Ameet\\eclipse-workspace\\Virtual Key For Your Repository\\Java_InterviewPreparation\\TextFile\\Write_TextFile.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Hello, my name is Amit Rakte.");
		bw.write("Welcome to Write_The_Data_In_TextFile");
		System.out.println("File has been created at :");
		System.out.println("C:\\Users\\Ameet\\eclipse-workspace\\Virtual Key For Your Repository\\Java_InterviewPreparation\\TextFile");
		
		bw.close(); //BufferedWriter must be closed to see the data in the .txt file you created.
	}

	public static void main(String[] args) throws IOException
	{
		Write_The_Data_In_TextFile write = new Write_The_Data_In_TextFile();
		write.Logic1();
	}
}
