package com.upper.operation;

import java.util.Scanner;

public class UpperCaseDemo {

	/**
	 * Author: Anil
	 * Description :Write a java program to search duplicate words in a
		string using regular expression.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String source = "hello good old world";
	  
		   Scanner input=new Scanner(System.in);
		   System.out.println("Enter The Text"); 
		 
		   String originalText = input.nextLine();
		   convertUpperCase(originalText);

	}

	private static void convertUpperCase(String originalText) {
		// TODO Auto-generated method stub
		String[] strArr = originalText.split(" ");
		  StringBuffer res = new StringBuffer();
		    
	    for (String str : strArr) {
	        char[] stringArray = str.trim().toCharArray();
	        stringArray[0] = Character.toUpperCase(stringArray[0]);
	        str = new String(stringArray);

	        res.append(str).append(" ");
	    }

	    System.out.print("Result: " + res.toString().trim());
	}

}
