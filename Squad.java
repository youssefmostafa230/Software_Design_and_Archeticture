package Archeticture_project;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
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
import java.io.File;  
import java.io.IOException; 

public class Squad 
{
	
	String First_Name;
	String Last_Name;
	String Nationality;
	String Position;
	String Club;
	String price;
	float sum=0;
	float max=100;
//	float res;
	int counter=0;
	int counter_Goalkeeper=0;
	int counter_Defender=0;
	int counter_Forward=0;
	int counter_Midfielder=0;
//-------------------------------------------------------------------
	public void create_file (String fi) throws IOException
	{
			File new_squad = new File("D:\\new_squad.txt");
		    boolean result = true;  
	     	result = new_squad.createNewFile();

	    	 if(result==true)
			{
				System.out.println("file created "+new_squad.getCanonicalPath()); 
			}
		    else
			{
				System.out.println("file already exists "+new_squad.getCanonicalPath()); 
			}
	}
	//------------------------------------------------------------
	public void create_squad (String s) throws IOException
	
	{ 
	
		  String[] araf = s.split(" ");
		  String position = araf[4];
		  String value = araf[3];
		  float w = Float.parseFloat(value);
		  

		  if (w<=max-sum && counter<15 )
		  {  

			  if(position.equals("Goalkeeper")  )
			  {
				 if(counter_Goalkeeper<2)
				 {
				  counter_Goalkeeper++;
				  Path path=Paths.get("D:\\new_squad.txt");
			   	  Files.write(path,  "\n".getBytes(), StandardOpenOption.APPEND);
				  Files.write(path,  s.getBytes(), StandardOpenOption.APPEND);
			      }
			  else 
				  System.out.println("mafysh makan lel goalKeeper");
			  
			  }
			  //-----------------------------------------------------------
			  else if(position.equals("Defender") )
			  {
				 if(counter_Defender<5)
				 {
				  counter_Defender++;
				  Path path=Paths.get("D:\\new_squad.txt");
			   	  Files.write(path,  "\n".getBytes(), StandardOpenOption.APPEND);
				  Files.write(path,  s.getBytes(), StandardOpenOption.APPEND);
				 }
			  else 
			  {
				  System.out.println("mafysh makan lel Defenders");
			  }
			  }
			  //-----------------------------------------------------------	  
			 else if(position.equals("Midfielder") )
			  {
		   		 if(counter_Midfielder<5 )
		   		 {
				  counter_Midfielder++;
				  Path path=Paths.get("D:\\new_squad.txt");
			   	  Files.write(path,  "\n".getBytes(), StandardOpenOption.APPEND);
				  Files.write(path,  s.getBytes(), StandardOpenOption.APPEND);
			     }
			  else 
			  {
				  System.out.println("mafysh makan lel Midfielders");
			  }
			  }
			  //-----------------------------------------------------------
			 else if(position.equals("Forward") )
			  {
				  if(counter_Forward<3 )
				  {
				  counter_Forward++;
				  Path path=Paths.get("D:\\new_squad.txt");
			   	  Files.write(path,  "\n".getBytes(), StandardOpenOption.APPEND);
				  Files.write(path,  s.getBytes(), StandardOpenOption.APPEND);
			      }
			  else 
			     {
				  System.out.println("mafysh makan lel Forwards");
			     }
			     }
			 sum=sum+w;
			 counter++;

		  }
		  else
		  { 
			  System.out.println("exceeds 100M$");
		  }
		  
	}
	//---------------------------------------------------------------
	
	}