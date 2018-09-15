package CONTROL_STATEMENTS;

import java.util.Scanner;

public class Switich_Case_Or_Condition_Statement_01 
{
   //  Integer -> Used for Switch Case
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Atomic Number: ");
		int atmno=sc.nextInt();
		
		final int x=34;
		switch (atmno)
		{
			case 1:
				System.out.println("Hydrogen");
				break;
			case 2:
				System.out.println("Helium");
				break;
			case 8:
				System.out.println("Oxygen");
				break;
			case x: //x is constant (Final Variable)
				System.out.println("Selenium");
				break;
			default:
				System.out.println("Invalid Number");
				break;	
		}
		
	}
}	
