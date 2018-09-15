package METHODS;

import java.util.Scanner;

public class MethodForAreaOfCircle 
{

	public static void main(String[] args) 
	{
		System.out.println("-----Method for Area of Circle-----");
		System.out.println("------------------------------------");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the radius :");
		double radius=sc.nextDouble();
		
		double ac=area(radius);
		System.out.println("Area of Circle is " +ac);
	}
    
	static double area(double radius)
	{
		double aoc=Math.PI*radius*radius;
		return aoc;
	}
}
