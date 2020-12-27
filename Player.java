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

public class Player 
{
	public String First_Name;
	public String Last_Name;
	public String Nationality;
	public String Position;
	public String Club;
	public float price;
	
	public void Add_new_player(String First_Name, String Last_Name, String Nationality, String Position, String Club, float price) throws IOException
	{
		
		FileWriter fw= new FileWriter("Players_information.txt", true);
		BufferedWriter Bw= new BufferedWriter(fw);
		Bw.write(First_Name);
		Bw.write(" ");
		Bw.write(Last_Name);
		Bw.write(" ");
		Bw.write(Nationality);
		Bw.write(" ");
		Bw.write(Position);
		Bw.write(" ");
		Bw.write(Club);
		Bw.write(" ");
		Bw.write((int) price);
		Bw.write("/n");
		Bw.close();
		fw.close();
	}
}
