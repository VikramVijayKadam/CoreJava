package Interview_Programs;

import java.util.Scanner;

public class FactorialRecursion 
{
	
	public static int fact(int n)
	{
		if(n==1)
		{
			return 1;
		}
		return n*(fact(n-1));
	}

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number : ");
        int n = scan.nextInt();
        
        System.out.println(fact(n));

	}

}

/*logic- 4*3*2*1=24
 * 
 * Output-
 * Enter a Number : 4
 * 24
 */

