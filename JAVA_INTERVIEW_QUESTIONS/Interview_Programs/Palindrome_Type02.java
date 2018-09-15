package Interview_Programs;

import java.util.Scanner;

public class Palindrome_Type02 
{
	public static String reverse(String source)
	{
		if(source==null || source.isEmpty())
		{
			return source;
		}
	    
		String reverse="";
		for(int i=source.length()-1;i>=0;i--)
		{
			reverse=reverse+source.charAt(i);
			
		}
		
		return reverse;
	}
	
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String :- ");
		String source=sc.nextLine();
		System.out.println(Palindrome_Type02.reverse(source));
			

	}

}

/*
 * output-
 * Enter the String :- qwertyuiop
 * poiuytrewq
 */

