package Archeticture_project;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.*;
import java.net.*;

public class Main 
{
	public static Register_Login EX= new Register_Login();
	public static Player p= new Player();
	public static Squad s1=new Squad();
	public static void main (String [] args) throws IOException
{ 
	/*String first_name= "youssef";
	String last_name= "Mostafa";
	String email= "youssef@gmail.com";
	String password= "youssef2001";
	String phone_number= "012";
	EX.Register(first_name, last_name, email, password, phone_number);
	EX.Login(email, password);*/
		
		
	Scanner FS= new Scanner(System.in);
	System.out.print("Enter fisrt name of player");
	String First_Name= FS.next();
	Scanner LS= new Scanner(System.in);
	System.out.print("Enter last name of player");
	String Last_Name= LS.next();
	Scanner N= new Scanner(System.in);
	System.out.print("Enter nationality of player");
	String Nationality= N.next();
	Scanner P= new Scanner(System.in);
	System.out.print("Enter position of player");
	String Position= P.next();
	Scanner C= new Scanner(System.in);
	System.out.print("Enter club that the player is currently playing in");
	String Club= C.next();
	Scanner pr= new Scanner(System.in);
	System.out.print("Enter price of player");
	float price= P.nextFloat();
	p.Add_new_player(First_Name, Last_Name, Nationality, Position, Club, price);
	
	//for(int i=0;i<2;i++)
	//{
		/*Scanner fs= new Scanner(System.in);
		System.out.print("Enter fisrt name of Goalkeeper: ");
		String first_name= fs.next();
		Scanner ls= new Scanner(System.in);
		System.out.print("Enter last name of Goalkeeper: ");
		String last_name= ls.next();
		s1.Add_New_Goalkeeper(first_name, last_name);*/
	//}
}
	
}
