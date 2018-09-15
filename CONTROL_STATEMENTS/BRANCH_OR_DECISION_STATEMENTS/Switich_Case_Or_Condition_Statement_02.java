package BRANCH_OR_DECISION_STATEMENTS;
/*
   Demo for using switch case for char for handling input in both the cases(Upper/Lower case)
 */
import java.util.Scanner;

public class Switich_Case_Or_Condition_Statement_02 
{
    // char -> Used for Switch Case(String input is converted to char)
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Country Code: ");
		String ip=sc.nextLine();
		ip=ip.toUpperCase();
		char cp=ip.charAt(0);// user can enter average number of char but it will take index of first char
		
		switch (cp)
		{
			case 'I':
				System.out.println("INDIA");
				break;
			case 'J':
				System.out.println("JAPAN");
				break;
			case 'A':
				System.out.println("AMERICA");
				break;
			case 'C': 
				System.out.println("CHINA");
				break;
				
			default:
				System.out.println("Invalid Country Code");
				break;
				
		}
		
	}
}	
