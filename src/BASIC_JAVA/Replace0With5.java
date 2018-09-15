package BASIC_JAVA;

import java.util.Scanner;

public class Replace0With5 
{
	static long convert0To5Rec(long num)
	{
		if (num == 0)
			return 0;
		long digit = num % 10; 
		if (digit == 0)
			digit = 5;
		return convert0To5Rec(num / 10) * 10 + digit;
	}
	static long convert0To5(long num)
	{
		if (num == 0)
			return 5;
		else
			return convert0To5Rec(num);
	}
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number and should contain 0 :");
		long in=sc.nextLong();
		
		System.out.print(convert0To5(in));
		
	}

}
