package TextFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Read_The_Data_From_TextFile 
{
	//Logic 01: By using FileReader and BufferReader;
	public void Logic1() throws IOException
	{
		System.out.println("By using Logic 01:");

		FileReader fr = new FileReader("C:\\Users\\Ameet\\eclipse-workspace\\Virtual Key For Your Repository\\Java_InterviewPreparation\\TextFile\\\\TextFile.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String text;
		System.out.println("The data of text file to be read is :");
		while((text=br.readLine())!=null)
		{
			System.out.println(text);
		}
		br.close(); //Close BufferedReader Once the task gets completed.
	}
	
	//Logic 02: By using File and Scanner;
	public void Logic2() throws IOException
	{
		System.out.println("By using Logic 02:");
		File file = new File("C:\\Users\\Ameet\\eclipse-workspace\\Virtual Key For Your Repository\\Java_InterviewPreparation\\TextFile\\\\TextFile.txt");
		Scanner scan = new Scanner(file);
		
		while(scan.hasNextLine())
		{
			System.out.println(scan.nextLine());
		}
	}
	
	//Logic 03: By using built in method Delimeter();
	public void Logic3() throws IOException
	{
		System.out.println("By using Logic 03:");
		File file = new File("C:\\Users\\Ameet\\eclipse-workspace\\Virtual Key For Your Repository\\Java_InterviewPreparation\\TextFile\\\\TextFile.txt");
		Scanner scan = new Scanner(file);
		
		scan.useDelimiter("\\z"); // we passed the regex parameter("\\z") to the built-in method useDelimeter();
		System.out.println(scan.next());
	}

	public static void main(String[] args) throws IOException 
	{
		Read_The_Data_From_TextFile read = new Read_The_Data_From_TextFile();
		
		//Call any logic method according to you..!!
		read.Logic2();
	}
}
