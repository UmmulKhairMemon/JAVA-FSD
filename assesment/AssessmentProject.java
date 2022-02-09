package com.si.assesment;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class AssessmentProject {
	static String Path; 
	 File file; 
	 public AssessmentProject() { 
	 Path = System.getProperty("user.dir"); //path for File Handling
	 file = new File(Path+"/files"); 
	 if (!file.exists()) 
		 file.mkdirs(); 
	 System.out.println(" DIRECTORY : "+ file.getAbsolutePath()); 
	 }  
	 private static final String MAIN_Menu = 
	 "\n MAIN MENU :- \n Enter your choice: \n"+ 
	" 1 : List of files present in directory in ascending order\n"+ 
	" 2 : Create, Delete or Search file\n"+ 
	" 3 : Exit Program"; 
	 private static final String Sub_Menu = 
	 " \n Enter your choice: \n"+ 
	 " a : Create a new file\n"+ 
	 " b : Delete file\n"+ 
	 " c : Search file\n"+ 
	 " d : Back to main menu"; 
	 void showMainMenu() { 
	 System.out.println(MAIN_Menu); 
	 try(Scanner scanner = new Scanner(System.in)){ 
	 
	 int option = scanner.nextInt(); 
	 switch (option){ 
	 case 1 : { 
	 showFiles(); 
	 showMainMenu(); 
	 } 
	 case 2 : { 
	 showSubMenu(); 
	 } 
	 case 3 : { 
	 System.out.println("Thank you."); 
	 System.exit(0); 
	 } 
	 default: showMainMenu(); 
	 } 
	 } 
	 catch (Exception e){ 
	 System.out.println("Please enter correct choice: 1, 2 or 3"); 
	 showMainMenu(); 
	 } 
	 } 
	 void showSubMenu() { 
	 System.out.println(Sub_Menu); 
	 try(Scanner scanner = new Scanner(System.in)) 
	 { 
	 char[] input = 
	scanner.nextLine().toLowerCase().trim().toCharArray(); 
	 char option = input[0]; 
	 switch (option){ 
	 case 'a' : { 
	 System.out.print("? Adding a file...Please enter desired file name : "); 
	 String filename = scanner.next().trim().toLowerCase(); 
	 createFile(filename); 
	 break; 
	 } 
	 case 'b' : { 
	 System.out.print("? Deleting a file...Please enter file name : "); 
	 String filename = scanner.next().trim(); 
	 deleteFile(filename); 
	 break; 
	 } 
	 case 'c' : { 
	 System.out.print("? Searching a File...Please enter file name : "); 
	 String filename = scanner.next().trim(); 
	 searchFile(filename); 
	 break; 
	 } 
	 case 'd' : { 
	 System.out.println("Go back to MAIN menu"); 
	 showMainMenu(); 
	 break; 
	 } 
	 default : System.out.println("Oops! Please enter correct choice: a, b, c or d"); 
	 } 
	 showSubMenu(); 
	 } 
	 catch (Exception e){ 
	 System.out.println("Oops!Please enter correct choice:a, b, c or d"); 
	 showSubMenu(); 
	 } 
	 } 
	 void showFiles() { 
	 if (file.list().length==0) 
	 System.out.println("No file found"); 
	 else { 
	 String[] list = file.list(); 
	 System.out.println("The file in ascending order"+ file +" are :"); 
	 Arrays.sort(list); 
	 for (String str:list) { 
	 System.out.println(str); 
	 } 
	 } 
	 } 
	 void createFile(String filename) { 
	 File filepath = new File(file+"/"+filename); 
	 String[] list = file.list(); 
	 for (String file: list) { 
	 if (filename.equalsIgnoreCase(file)) { 
	 System.out.println("Oops!File" + filename + " already exists at "+ file); 
	 return; 
	 } 
	 } 
	 try {
		filepath.createNewFile();
	} catch (IOException e) {

		e.printStackTrace();
	} 
	 System.out.println("File"+filename+" added to "+ file); 
	 } 
	 void deleteFile(String filename) { 
	 File filepath = new File(file +"/"+filename); 
	 String[] list = file.list(); 
	 for (String file: list) { 
	 if (filename.equals(file) && filepath.delete()) { 
	 System.out.println("File " + filename + " deleted from " + 
	file); 
	 return; 
	 } 
	 } 
	 System.out.println("Oops!Delete Operation failed. FILE NOT FOUND"); 
	 } 
	 
	 void searchFile(String filename) { 
	 String[] list = file.list(); 
	 for (String file: list) { 
	 if (filename.equals(file)) { 
	 System.out.println("FOUND :File " + filename + " exists at "+ file); 
	 return; 
	 } 
	 } 
	 System.out.println("File NOT Found"); 
	 } 
	 public static void main(String[] args) { 
		 System.out.println(" LockedME.com"); 
		 System.out.println(" Developed by:- Ummul Memon");
	     AssessmentProject menu = new AssessmentProject(); 
	      menu.showMainMenu(); 
	       } 
	    }

