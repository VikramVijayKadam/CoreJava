package OPERATORS;

import java.util.Scanner;

public class ConditionalOperatorType04 
{

	public static void main(String[] args) 
	{
	 @SuppressWarnings("resource")
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Your Marks :");
	 int marks=sc.nextInt();
	 
	 String res= (marks>0 && marks<50)?"Fail":
		         (marks>=50 && marks<=60)?"Pass":
		         (marks>=60 && marks<=75)?"First Class":
		         (marks>=75 && marks<=100)?"Distinction":
		         (marks<0)?"Invalid":"Invalid";
	 
	 System.out.println("Your Marks is "+marks+" and Result is "+res);

	}

}
