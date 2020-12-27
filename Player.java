package Archeticture_project;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Player 
{
	String First_Name;
	String Last_Name;
	String Nationality;
	String Position;
	String Club;
	String price;
	
	public void Add_new_player(String First_Name, String Last_Name, String Nationality, String Position, String Club, String Price) throws IOException
	{
		 LinkedList<String> l=new LinkedList<String>();
		 l.add(First_Name);
		 l.add(Last_Name);
		 l.add(Nationality);
		 l.add(Position);
		 l.add(Club);
		 l.add(Price);
		 
		 String new_player = l.stream().collect(Collectors.joining(" "));
	     Path path=Paths.get("D:\\Players_information.txt");
	     Files.write(path,  new_player.getBytes(), StandardOpenOption.APPEND);
	     Files.write(path,  "\n".getBytes(), StandardOpenOption.APPEND);
	}
	//----------------------------------------------------------------------------
	public void Retrieve(String Last_Name) throws IOException
	{
		 BufferedReader read = new BufferedReader(new FileReader ("D:\\Players_information.txt"));
		 String q = read.readLine();
		 LinkedList<String> listword=new LinkedList<String>();
		 LinkedList<String> listLines=new LinkedList<String>();
		 listLines.add(q);
		 
		while(q !=null)
		{
			String[] ta = q.split(" ");
			String ln = ta[1];
			listword.add(ln);
			q = read.readLine();
		}
			for(int i = 0; i<listword.size(); i++)
			{
				if(Last_Name.equals(listword.get(i)))
				{
					System.out.println(listLines.get(i));
				}
			}
		}
}