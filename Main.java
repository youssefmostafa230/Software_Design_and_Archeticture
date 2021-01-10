package Archeticture_project;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
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
	public static Events E= new Events();
	 
	public static void main (String [] args) throws IOException
	{ 
			
		//Player p= new Player();
		//Squad S= new Squad();
		//Events E= new Events();
		//Squad1 S= new Squad();

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
		System.out.println("1.add player");
		System.out.println("2.Retrieve");
		System.out.println("3.Create Squad");
		System.out.println("4.add new squad");
		System.out.println("5.add new event");
		//System.out.println("5.check the score for a giver gameweek:");


		Scanner options = new Scanner(System.in);
		String chosen = options.nextLine();
		
		if(chosen.equals("1"))
			
		{

		   System.out.print("Enter fisrt name of player: \n");
	       Scanner input=new Scanner(System.in);
	       String a =input.nextLine();
	    
	       System.out.print("Enter last name of player: \n");
	       Scanner input1=new Scanner(System.in);
	       String b =input1.nextLine();
	        
	       System.out.print("Enter nationality of player: \n");
	       Scanner input2=new Scanner(System.in);
	       String c =input2.nextLine();
	       
	       System.out.print("Enter club that the player is currently playing in: \n");
	       Scanner input3=new Scanner(System.in);
	       String d =input2.nextLine();
	       
	       System.out.print("Enter price of player: \n");
	       Scanner input4=new Scanner(System.in);
	       String e =input3.nextLine();
	       
	       System.out.print("Enter position of player: \n");
	       Scanner input5=new Scanner(System.in);
	       String f =input4.nextLine();         
	      
	       
	      // System.out.print("Enter The total points of the player: \n");
	      // Scanner input5=new Scanner(System.in);
	      // String f =input5.nextLine();
	       
	       //System.out.print("Enter The game week points of the player: \n");
	       //Scanner input6=new Scanner(System.in);
	       //String g =input6.nextLine();
	       
	       p.Add_new_player(a, b, c, d, e, f);
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
		         System.out.print("Enter the name of the new squad: \n"); 
		         Scanner esm=new Scanner(System.in);
			     String name =esm.nextLine();
			     System.out.print("Enter the players: \n");
			     File new_squad = new File("new/../NewSquad.txt");
				 System.out.println(new_squad.getPath());
				 System.out.println(new_squad.getAbsolutePath());
				 FileWriter fw=new FileWriter(new_squad, true);
				 fw.write("\n"+name+"\n");
				 fw.close();
		    	 //Files.write(path,  "\n".getBytes(), StandardOpenOption.APPEND);
			   	 //Files.write(path,  name.getBytes(), StandardOpenOption.APPEND);
			   	 //Files.write(path,  "\n".getBytes(), StandardOpenOption.APPEND);
			   	for (int j=0; j<15; j++)
			     {
				     Scanner stor=new Scanner(System.in);
			         String elplayers =stor.nextLine();
			         S.create_squad(elplayers);
			        
			     }	   
		}
		
		/*Bernd Leno Arsenal 4 Goalkeeper 0 0
		John Stones Man-City 20 Defender
		Mateusz Klich Leeds 5 Midfielder
		Anthony Martial Man-Utd 3 Forward*/
		
		else if(chosen.equals("5"))
		{
	       System.out.print("Choose which action u need to add: \n");
	       System.out.print("1:For playing up to 60 minutes \n");
	       System.out.print("2:For playing 60 minutes or more (excluding stoppage time) \\n");
	       System.out.print("3:For each goal scored by a goalkeeper or defender \n");
	       System.out.print("4:For each goal scored by a midfielder \n");
	       System.out.print("5:For each goal scored by a forward \n");
	       System.out.print("6:For each goal assist \n");
	       System.out.print("7:For a clean sheet by a goalkeeper or defender \n");
	       System.out.print("8:For a clean sheet by a midfielder \n");
	       System.out.print("9:For every 3 shot saves by a goalkeeper \n");
	       System.out.print("10:For each penalty save \n");
	       System.out.print("11:For each penalty miss \n");
	       System.out.print("12:Bonus points for the best players in a match \n");
	       System.out.print("13:For every 2 goals conceded by a goalkeeper or defender \n");
	       System.out.print("14:For each yellow card \n");
	       System.out.print("15:For each red card \n");
	       System.out.print("16:For each own goal \n");

	       System.out.print("Action: ");
	       Scanner a1=new Scanner(System.in);
	       String action =a1.nextLine();
	       
	       System.out.print("Enter last name of the player: ");
	       Scanner l1=new Scanner(System.in);
	       String LastName =l1.nextLine();
	       
	       System.out.print("Enter the gameweek that you wish to update: ");
	       Scanner gw1=new Scanner(System.in);
	       String gameweek =gw1.nextLine();
	       E.add_new_event(action, LastName, gameweek);
	    
	       
		}
	}
		
		
	}	
	}