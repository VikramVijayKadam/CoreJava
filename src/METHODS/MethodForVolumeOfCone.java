package METHODS;

import java.util.Scanner;

public class MethodForVolumeOfCone 
{

	public static void main(String[] args) 
	{
		System.out.println("-----Method for Volume of Cone-----");
		System.out.println("------------------------------------");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the radius :");
		double radius=sc.nextDouble();
		
		System.out.println("Enter the height :");
		double height=sc.nextDouble();
		
		double vc=volume(radius, height);
		System.out.println("Volume of Cone is " +vc);
	}
    
	static double volume(double radius, double height)
	{
		double vocone=Math.PI*radius*radius*height/3;
		return vocone;
	}
}
