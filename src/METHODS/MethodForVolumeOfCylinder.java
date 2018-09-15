package METHODS;

import java.util.Scanner;

public class MethodForVolumeOfCylinder 
{

	public static void main(String[] args) 
	{
		System.out.println("-----Method for Volume of Cylinder-----");
		System.out.println("------------------------------------");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the radius :");
		double radius=sc.nextDouble();
		
		System.out.println("Enter the height :");
		double height=sc.nextDouble();
		
		double vc=volume(radius, height);
		System.out.println("Volume of Cylinder is " +vc);
	}
    
	static double volume(double radius, double height)
	{
		double vocylinder=Math.PI*radius*radius*height;
		return vocylinder;
	}
}
