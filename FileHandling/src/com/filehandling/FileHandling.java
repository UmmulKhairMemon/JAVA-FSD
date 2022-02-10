package com.filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

 	  public static void calculator() throws IOException
 	  {
 		 Double num1,num2,ans=(double) 0;
 	 	  String operation;
 	  Scanner sc = new Scanner(System.in);
 	  
 	  System.out.println("Enter the number:");
 	  num1 = sc.nextDouble();
 	  num2 = sc.nextDouble();
 	  
 	  Scanner op = new Scanner(System.in);

       System.out.println("Enter the Operation (+,-,*,/):");
       operation = op.next();
         
     			 if (operation.equals("+"))
        		  {
     				  ans=num1+num2;
        		      System.out.println("Your answer = " +ans);
        		  }
     			 else if (operation.equals("-"))
        		  {
     				  ans=num1-num2;
        		      System.out.println("Your answer = " +ans);
        		  }
     			 else if (operation.equals("*"))
        		  {
     				  ans=num1*num2;
        		      System.out.println("Your answer = " +ans);
        		  }
     			 else if (operation .equals( "/"))
        		  {
     				  ans=num1/num2;
        		      System.out.println("Your answer = " +ans);
        		  }
        		  else
        		  {
        			  System.out.println("Error! Enter Correct Operation");
        		  }
        		  
		
        		  File file=new File("C:\\Users\\ummul\\Downloads\\Tranning_FSD\\Project\\FileHandling\\file1.txt");
        			
        			if(file.createNewFile())
        			{
        				System.out.println("File is created");
        			}
        			else
        			{
        				System.out.println("File is already Exist");
        			}
        			//write data to that file
        			FileWriter writer= new FileWriter(file);
        			writer.append("\nBasic Arithmetic Calculator");
        			writer.append("\n\nFirst Number:"+num1+ "\nOperation is:"+operation+ "\nSecond number:"+num2+ "\nAnswer="+ans);
        			writer.close();
        			FileReader reader= new FileReader("C:\\Users\\ummul\\Documents\\File\\f1.txt");
        			int data;
        			while((data=reader.read())!=-1)
        			{
        				System.out.print((char)data);
        			}
        			
 	  }
	 
 	 public static void main(String[] args) {
 		try {
 			calculator();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
 		
 	 }
}
