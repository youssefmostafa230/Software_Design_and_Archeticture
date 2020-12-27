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
import java.util.Scanner;

public class Squad 
{
	public String[] Team= new String[15];
	public static int Total_No_of_players=0;
	public static int Total_Budget=0;
	public static int No_of_Goalkeepers=0;
	public static int No_of_Defenders=0;
	public static int No_of_Midfilders=0;
	public static int No_of_Forwards=0;
	public String GK_first_name;
	public String GK_last_name; 
	
	public void Add_New_Goalkeeper(String GK_first_name, String GK_last_name) throws IOException
	{
		while(No_of_Goalkeepers<2)
		{
			FileWriter fw= new FileWriter("Squad.txt", true);
			BufferedWriter Bw= new BufferedWriter(fw);
			Bw.write(GK_first_name);
			Bw.write(" ");
			Bw.write(GK_last_name);
			Bw.write("\n");
			Bw.close();
			fw.close();
			No_of_Goalkeepers++;
		}
	}
	
	public static void Add_to_squad()
	{
		Player p1= new Player();
		while(Total_No_of_players<15)
		{
			for(int i=0;i<2;i++)
			{
				
			}
		}
	}
}
