package Archeticture_project;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.*;
import java.net.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main 
{
	public static User_info EX= new User_info();
	public static Player p= new Player();
	public static Squad S= new Squad();
	 
	public static void main (String [] args) throws IOException
{ 
		
	String first_name= "youssef";
	String last_name= "Mostafa";
	String email= "youssef@gmail.com";
	String password= "youssef2001";
	String phone_number= "012";
	EX.Register(first_name, last_name, email, password, phone_number);
	//EX.Login(email, password);
//--------------------------------------------------------------------
	boolean y =true;
	while(y==true)
	{
	System.out.println("Please choose from the following: ");
	System.out.println("1.Create");
	System.out.println("2.Retrieve");
	System.out.println("3.Create Squad");
	System.out.println("4.add new squad:");


	Scanner options = new Scanner(System.in);
	String chosen = options.nextLine();
	
	if(chosen.equals("1"))
		
	{

	   System.out.print("Enter fisrt name of player: \n");
       Scanner input=new Scanner(System.in);
       String a =input.nextLine();
    
       System.out.print("Enter last name of player: \n");
       Scanner input1=new Scanner(System.in);
       String b =input.nextLine();
        
       System.out.print("Enter nationality of player: \n");
       Scanner input2=new Scanner(System.in);
       String c =input.nextLine();
        
       System.out.print("Enter position of player: \n");
       Scanner input3=new Scanner(System.in);
       String d =input.nextLine();         
      
       System.out.print("Enter club that the player is currently playing in: \n");
       Scanner input5=new Scanner(System.in);
       String f =input.nextLine();
       
       System.out.print("Enter price of player: \n");
       Scanner input4=new Scanner(System.in);
       String e =input.nextLine();
       p.Add_new_player(a, b, c, d, f, e);
	}
	
	else if(chosen.equals("2"))
	
	{
       
       System.out.print("Enter last name of player: ");
       Scanner input6=new Scanner(System.in);
       String c1 =input6.nextLine();
       p.Retrieve(c1);
	}
     
	else if(chosen.equals("3"))
	{
		String fi = null;
		S.create_file(fi);
	    System.out.print("Enter the  15 players info: "); 
	    for (int i=0; i<15; i++)
	     {
		   Scanner input=new Scanner(System.in);
	       String s =input.nextLine();
	       S.create_squad(s);
	       
	     }

	}
	else if(chosen.equals("4"))
	{ 
	         //System.out.print("Enter the new squad players \n"); 
	         System.out.print("Enter the name of the new squad: \n"); 
	         Scanner esm=new Scanner(System.in);
		     String name =esm.nextLine();
		     System.out.print("Enter the players: \n");
	    	 Path path=Paths.get("new_squad.txt");
	    	 Files.write(path,  "\n".getBytes(), StandardOpenOption.APPEND);
		   	 Files.write(path,  name.getBytes(), StandardOpenOption.APPEND);
		   	 Files.write(path,  "\n".getBytes(), StandardOpenOption.APPEND);
		   	for (int j=0; j<15; j++)
		     {
			     Scanner stor=new Scanner(System.in);
		         String elplayers =stor.nextLine();
		         S.create_squad(elplayers);
		        
		     }	   
	    
	}
	
	/*Bernd Leno Arsenal 4 Goalkeeper
	John Stones Man-City 4 Defender
	Mateusz Klich Leeds 5 Midfielder
	Anthony Martial Man-Utd 3 Forward*/
	
}
	
	
}	
}