package Archeticture_project;
import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


public class User_info
{
	
	public void Register(String first_name, String last_name, String email, String password, String phone_number) throws IOException
	{
		String input=email;
		String input2=password;
		File email_password= new File("D:\\email_password.txt");
		Path path=Paths.get("D:\\email_password.txt");
		boolean result=true;
		result = email_password.createNewFile();
		Files.write(path, input.getBytes(), StandardOpenOption.APPEND);
		Files.write(path, "\n".getBytes(), StandardOpenOption.APPEND);
		Files.write(path, input2.getBytes(), StandardOpenOption.APPEND);
		if(result==true)
		{
			System.out.println("file created "+email_password.getCanonicalPath()); 
		}
		else
		{
			System.out.println("file already exists "+email_password.getCanonicalPath()); 
		}
		
	//-------------------------------------------
		String input3=first_name;
		String input4=last_name;
		String input5=phone_number;
		File User_info= new File("D:\\User_info.txt");
		Path path1=Paths.get("D:\\User_info.txt");
		boolean result1=true;
		result1 = User_info.createNewFile();
		Files.write(path1, input3.getBytes(), StandardOpenOption.APPEND);
		Files.write(path1, "\n".getBytes(), StandardOpenOption.APPEND);
		Files.write(path1, input4.getBytes(), StandardOpenOption.APPEND);
		Files.write(path1, "\n".getBytes(), StandardOpenOption.APPEND);
		Files.write(path1, input5.getBytes(), StandardOpenOption.APPEND);
		if(result1==true)
		{
			System.out.println("file created "+User_info.getCanonicalPath()); 
		}
		else
		{
			System.out.println("file already exists "+User_info.getCanonicalPath()); 
		}
		
	}
	
	public void Login(String email, String password) throws IOException
	{
		String users[] = new String[50];
		File email_password2= new File("D:\\email_password.txt");
		BufferedReader r = new BufferedReader(new FileReader(email_password2)); 
		String line;
		int index =0;
		while((line=r.readLine())!=null) 
		{
			users[index] =line;
			index++;
		}
		for(int i =0;i<50;i=i+2) 
		{
			if(email.equals(users[i])) 
			{
				if(password.equals(users[i+1])) 
				{
					System.out.println("Login Successfully");
				}
				else
				{
					System.out.println("unsuccessfull login");
				}
			}
		}
	}
}
