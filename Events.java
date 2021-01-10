package Archeticture_project;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.io.File;  
import java.io.IOException; 

public class Events {
	String First_Name;
	String Last_Name;
	//String Nationality;
	String Club;
	String Price;
	String Position;
	String Total_Points;
	String Game_Week_Points;
	public static int totalp=0;
	public static int weekp=0;
	public static Integer arr_ofgameweeks[]={0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	
	/*public void Players_array() throws IOException
	{
		 File f= new File("Players/../PlayersInformation.txt");
		 System.out.println(f.getPath());
		 System.out.println(f.getAbsolutePath());
		 BufferedReader read = new BufferedReader(new FileReader ("Players/../PlayersInformation.txt"));
		 String q = read.readLine();
		 LinkedList<String> listword=new LinkedList<String>();
		 LinkedList<String> listLines=new LinkedList<String>();
		// System.out.print("....haball..1..");
		 while(q !=null)
			{
				String[] ta = q.split(" ");
				String ln = ta[1];
				listword.add(ln);
				listLines.add(q);
				q = read.readLine();
				//System.out.print("....haball..2..");
			}
			for(int i = 0; i<listword.size(); i++)
			{
				//System.out.print("....haball..3..");
				File f1= new File("Array/../Arrayofplayers.txt");
				System.out.println(f1.getPath());
				System.out.println(f1.getAbsolutePath());
				String habal = listword.get(i);
				//System.out.print(habal);
				FileWriter fw=new FileWriter(f1, true);
				fw.write(habal+"\n");
				fw.close();
				//Files.write(paths,  habal.getBytes(), StandardOpenOption.APPEND);
			    //Files.write(paths,  "\n".getBytes(), StandardOpenOption.APPEND);
			    //System.out.print("....haball..4..");
			}
		
		
	     
		 
		// Files.write(path,  new_player.getBytes(), StandardOpenOption.APPEND);
	     //Files.write(path,  "\n".getBytes(), StandardOpenOption.APPEND);
	     
	}*/
	public void end_week ()
	{
		
	}
	
	public String action;
	public String LastName;
	public String gameweek;
	public void add_new_event (String action, String LastName, String gameweek) throws IOException
	{
		//String ln ="";
		//InputStream f2 = null;
		File f= new File("Players/../PlayersInformation.txt");
		System.out.println(f.getPath());
		System.out.println(f.getAbsolutePath());
		int games = Integer.parseInt(gameweek);
		//BufferedReader br = new BufferedReader(new FileReader ("Players/../PlayersInformation.txt"));
		//String q = read.readLine();
		LinkedList<String> listword=new LinkedList<String>();
		LinkedList<String> listLines=new LinkedList<String>();
		//String[] ta = new String[8];
		//String ln = ta[1];
		//String ln = ta[1];
		Scanner scanner = new Scanner(new File("Players/../PlayersInformation.txt"));
		StringBuilder resultStringBuilder = new StringBuilder();
	    BufferedReader br= new BufferedReader(new FileReader(f));	   
		String line;
		line=br.readLine();
		String[] Divide = new String[45];
		while (line != null) 
		{
		    resultStringBuilder.append(line).append("\n");
			Divide = line.split(" ");
		    String Last_Name= Divide[1];
		    String WeekPoints= Divide[6];
		    listword.add(Last_Name);
		    for(int p=0; p<Divide.length; p++)
		    {	
		        listLines.add(Divide[p]);
		        line=br.readLine();
		    }
		            
		}
		        //listLines.add(line);
		        //line=br.readLine();
	            //System.out.println(line);
	            
			   
		

		for(int i = 0; i<listword.size(); i++)
		{
			if(LastName.equals(Divide[1]))
			{
		     if (action.equals("1"))
		     {
		    	  weekp++;
		    	  totalp+=weekp;
		     }
		     else if(action.equals("2"))
		     {
		    	 weekp+=2;
		    	 totalp+=weekp;
		     }
		     else if(action.equals("3"))
		     {
				
				 if(Position.equals("Goalkeeper"))
				 {
					 weekp+=6;
					 totalp+=weekp;
				 }
				 else if(Position.equals("Defender"))
				 {
					 weekp+=6;
					 totalp+=weekp;
				 }
		     }
		     else if(action.equals("4"))
		     {
		    	
				 if(Position.equals("Midfilder"))
				 {
					 weekp+=5;
					 totalp+=weekp;
				 }
		     }
		     else if(action.equals("5"))
		     {
		    	 
				 if(Position.equals("Forward"))
				 {
					 weekp+=6;
					 totalp+=weekp;
				 }
		     }
		     else if(action.equals("6"))
		     {
		    	weekp+=3;
		    	totalp+=weekp;
		     }
		     else if(action.equals("7"))
		     {
		    	
				 if(Position.equals("Goalkeeper"))
				 {
					 weekp+=4;
					 totalp+=weekp;
				 }
				 else if(Position.equals("Defender"))
				 {
					 weekp+=4;
					 totalp+=weekp;
				 }
		     }
		     else if(action.equals("8"))
		     {
		    	 
				 if(Position.equals("Midfilder"))
				 {
					 weekp+=1;
					 totalp+=weekp;
				 }
		     }
		     else if(action.equals("9"))
		     {
		    	 
				 if(Position.equals("Goalkeeper"))
				 {
					 weekp+=1;
					 totalp+=weekp;
				 }
		     }
		     else if(action.equals("10"))
		     {
		    	 weekp+=5;
		    	 totalp+=weekp;
		     }
		     else if(action.equals("11"))
		     {
		    	 weekp-=2;
		    	 totalp+=weekp;
		     }
		     else if(action.equals("12"))
		     {
		    	 weekp+=2;
		    	 totalp+=weekp;
		     }
		     else if(action.equals("13"))
		     {
		    	
				 if(Position.equals("Goalkeeper"))
				 {
					 weekp-=1;
					 totalp+=weekp;
				 }
				 else if(Position.equals("Defender"))
				 {
					 weekp-=1;
					 totalp+=weekp;
				 }
		     }
		     else if(action.equals("14"))
		     {
		    	 weekp-=1;
		    	 totalp+=weekp;
		     }
		     else if(action.equals("15"))
		     {
		    	 weekp-=3;
		    	 totalp+=weekp;
		     }
		     else if(action.equals("16"))
		     {
		    	 weekp-=2;
		    	 totalp+=weekp;
		     }
		     //by8ayar el weekpoints w el total points:
		     
		      File fileToBeModified = new File("Players/../PlayersInformation.txt");
	 		  String oldContent="";
	 		  BufferedReader B_reader = new BufferedReader(new FileReader(fileToBeModified));
	 		  String line1 = B_reader.readLine();
	 		  //String line2 = B_reader.readLine();
	 		  LinkedList<String> line2 = new LinkedList<String>();
	 		  String points = String.valueOf(weekp);
	 		  String total = String.valueOf(totalp);
	 		  while (line1 != null)
	 		 	{
	 		        oldContent = oldContent + line1 + System.lineSeparator();
	 		        line1 = B_reader.readLine();
	 		 	}
	 		 //while (line2 != null)
	 		 	//{
	 		       // oldContent = oldContent + line2 + System.lineSeparator();
	 		        //line2 = B_reader.readLine();
	 		 	//}
	 		  //LinkedList<String> liner = new LinkedList<String>();
	 		  //liner.add(listLines.get(i));
	 		// String[] zeft = listLines.get(i).split(" ");
	 		  //System.out.println(liner);
	 		  String Joining = String.join(" ",listLines);
	 		  System.out.println(Joining);
	 		  System.out.print("\n");
	 		  int index= 6+ (games-1);
	 		  //int index1= 45;
	 		  listLines.set(index, points);
	 		  //listLines.set(index1, total);
	 		  String newjoin = String.join(" ",listLines);
	 		  System.out.println(newjoin);
	 		  String newContent = oldContent.replaceAll(Joining, newjoin);
	 		  FileWriter writer = new FileWriter(fileToBeModified);
	 		  writer.write(newContent);
	 		  B_reader.close();
	 		  writer.close();
		     }
		}

	}

}