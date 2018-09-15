package METHODS;

import java.util.Scanner;

public class MethodForVolumeOfCube 
{

	public static void main(String[] args) 
	{
		System.out.println("-----Method for Volume of Cube-----");
		System.out.println("------------------------------------");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length :");
		double length=sc.nextDouble();
		
		System.out.println("Enter the Breadth :");
		double breadth=sc.nextDouble();
		
		System.out.println("Enter the height :");
		double height=sc.nextDouble();
		
		double vc=volume(length, breadth, height);
		System.out.println("Volume of Cube is " +vc);
	}
    
	static double volume(double length, double breadth, double height)
	{
		double vocube=length*breadth*height;
		return vocube;
	}
}
