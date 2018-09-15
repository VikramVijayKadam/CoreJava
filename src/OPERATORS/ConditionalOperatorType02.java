package OPERATORS;

import java.util.Scanner;

public class ConditionalOperatorType02 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Name :");
		String name=sc.nextLine();
		
		System.out.println("Enter Your Subject :");
		String subject=sc.nextLine();
		
		System.out.println("Enter Your Marks :");
		int marks=sc.nextInt();
	
		String res=marks>=50?"PASS":"FAIL";
		
		System.out.println("Hello "+name+" Your Result is "+res+" in Subject "+subject);

	}

}
