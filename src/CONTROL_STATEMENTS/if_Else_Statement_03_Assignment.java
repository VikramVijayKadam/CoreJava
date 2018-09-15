package CONTROL_STATEMENTS;

import java.util.Scanner;

/**
 * Take marks from the user and classify as Pass/Fail/FirstClass/Distinction or invalid using if...else if
 * 
 * @author Vikram Vijay Kadam
 *
 */

public class if_Else_Statement_03_Assignment 
{

	public static void main(String[] args) 
	{
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Marks Obtained :");
	int marks=sc.nextInt();
	
	if(marks>=0 && marks<=34)
		System.out.println("Fail");
	
	else if(marks>=35 && marks<=49)
		System.out.println("Pass");
	
	else if(marks>=50 && marks<=74)
         System.out.println("First Class");
	
	else if(marks>=75 && marks<=100)
		System.out.println("Distinction");
	
	else
		System.out.println("Invalid");
	}

}
