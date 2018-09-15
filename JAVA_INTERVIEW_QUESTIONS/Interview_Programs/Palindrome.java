package Interview_Programs;

import java.util.Scanner;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		String str="";
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String :-");
		String str1 = sc.nextLine();
		
		for(int i=str1.length()-1;i>=0;i--)
		{
			str=str+str1.charAt(i);
		}
		System.out.println(str);
		
		if(str.equals(str1))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not a Palindrome");
		}
		

	}

}


/*
 * output-
 *Enter a String :-qwertyuiop
 *poiuytrewq
 *String is not a Palindrome
 * 
 */
