package com.si.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;



public class EmailValidation {

	String array []= {"harry@gmail.com","emma@hotmail.com","ron@redffmail.com","songjong@tesla.com","rubyethan@sky.com",
			           "jyoti@grace.com","rm@bts.com","jungkook@bts.com","jin@bts.com","jimin@bts.com","jHope@bts.com",
			           "suga@bts.com","v@bts.com"};
	
	List<String> list = new ArrayList<>(Arrays.asList(array));
	//List<String> list = new ArrayList<>(Array.asList(array));
	Scanner sc = new Scanner(System.in);
	String s;
	
	public void enteremail()
	{
		System.out.println("Enter an e-mail you want to searched:");
		s=sc.next();
		System.out.println("Entered e-mail:"+s);
	}
	public void emailvalidation()
	{
		int index = list.indexOf(s);
		
		if(list.contains(s)==true)
		{
			System.out.println("User Authenticated:"+s);
			System.out.println("Your entered e-mail ID : "+index);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmailValidation
		ev = new EmailValidation();
		
		int n;
		
		 while(true)
		 {
			 System.out.println("Menu:");
			 System.out.println("1.Enter e-mail for authentication \n2.User Authenticate");
			 
			 System.out.println("Enter your choice:");
			 n= sc.nextInt();
			 if(n==1)
			 {
				 ev.enteremail();
			 }
			 else if(n==2)
			 {
				 ev.emailvalidation();
			 }
			 else
			 {
				 break;
			 }
		 }
		 System.out.println("Error! Enter correct email");
	}
}
