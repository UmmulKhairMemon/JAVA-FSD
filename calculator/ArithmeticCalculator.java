package com.si.calculator;
import java.util.Scanner;

public class ArithmeticCalculator {
      public static void main(String args[])
      {
    	  Double num1,num2;
    	  String operation;
    	  Scanner sc = new Scanner(System.in);
    	  
    	  System.out.println("Enter the number:");
    	  num1 = sc.nextDouble();
    	  num2 = sc.nextDouble();
    	  
    	  Scanner op = new Scanner(System.in);

          System.out.println("Enter the Operation (+,-,*,/)");
          operation = op.next();
              
                  if (operation.equals("+"))
        		  {
        		      System.out.println("Your answer = " + (num1 + num2));
        		  }
                  else if (operation.equals("-"))
        		  {
        		      System.out.println("Your answer = " + (num1 - num2));
        		  }
                  else if (operation.equals("/"))
        		  {
        		      System.out.println("Your answer = " + (num1 / num2));
        		  }
                  else if (operation .equals( "*"))
        		  {
        		      System.out.println("Your answer = " + (num1 * num2));
        		  }
 
        		  else
        		  {
        			  System.out.println("Error! Enter correct Operation");
        		  }
      }
}
