package METHODS;

import java.util.Scanner;

//Write a method to find the total amount to be paid principal rate of interest and time
public class MethodAssignment02 
{
	
	
	public static void main(String[] args) 
	{
	 double amt=si();
	 System.out.println("The Amount to be paid ="+amt);
	 
	}
	
	static double si()
	{
		System.out.println("To Find the Total Amount to be Paid with Interset");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Principal :");
		double p=sc.nextDouble();
		
		System.out.print("Enter the Rate of Interset :");
		double r=sc.nextDouble();
		
		System.out.print("Enter the Time Period :");
		double t=sc.nextDouble();
		
		double i=(p*r*t)/100;
		System.out.print("The Total Interset :"+i);
		
		double a=p+i;
		return a;
	}

}
