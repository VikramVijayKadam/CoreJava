package METHODS;

import java.util.Scanner;

public class MethodForAreaOfSqure 
{

	public static void main(String[] args) 
	{
		System.out.println("-----Method for Area of Square-----");
		System.out.println("------------------------------------");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length :");
		double length=sc.nextDouble();
		
		System.out.println("Enter the Breadth :");
		double breadth=sc.nextDouble();
		
		double ac=area(length, breadth);
		System.out.println("Area of Square is " +ac);
	}
    
	static double area(double length, double breadth)
	{
		double aos=length*breadth;
		return aos;
	}
}
