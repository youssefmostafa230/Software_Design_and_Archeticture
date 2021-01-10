package Archeticture_project;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
	public int gameweekpoints=0;
	Integer Gameweekpoints[]= {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	public int totalpoints=0;
	
	public void Add_new_player(String First_Name, String Last_Name, String Nationality, String Position, String Club, String Price) throws IOException
	{
		 LinkedList<String> l=new LinkedList<String>();
		 l.add(First_Name);
		 l.add(Last_Name);
		 l.add(Nationality);
		 l.add(Position);
		 l.add(Club);
		 l.add(Price);
		 //l.add(gameweek);
		 
		 String new_player = l.stream().collect(Collectors.joining(" "));
		 File f= new File("Players/../PlayersInformation.txt");
		 System.out.println(f.getPath());
		 System.out.println(f.getAbsolutePath());
		 FileWriter fw=new FileWriter(f, true);
		 //FileWriter fr = new FileWriter("PlayersInformation.txt");
         //BufferedWriter br = new BufferedWriter(fr);
         //PrintWriter out = new PrintWriter(br);
         fw.write(new_player+" ");
		 for(int i=0;i<Gameweekpoints.length;i++)
		 {
			 if(Gameweekpoints[i]!=null)
			 {
				 fw.write(Gameweekpoints[i]+" ");
			 }
		 }
		 fw.write(totalpoints+"\n");
		 fw.close();
	     //Path path=Paths.get("Players_information.txt");
	     //Files.write(f,  new_player.getBytes(), StandardOpenOption.APPEND);
	     //Files.write(f,  "\n".getBytes(), StandardOpenOption.APPEND);
	}
	//----------------------------------------------------------------------------
	public void Retrieve(String Last_Name) throws IOException
	{
		 File f= new File("Players/../PlayersInformation.txt");
		 System.out.println(f.getPath());
		 System.out.println(f.getAbsolutePath());
		 BufferedReader read = new BufferedReader(new FileReader ("Players/../PlayersInformation.txt"));
		 String q = read.readLine();
		 LinkedList<String> listword=new LinkedList<String>();
		 LinkedList<String> listLines=new LinkedList<String>();
		 
		 
		while(q !=null)
		{
			String[] ta = q.split(" ");
			String ln = ta[1];
			listword.add(ln);
			listLines.add(q);
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