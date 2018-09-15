package CONTROL_STATEMENTS;
/*
   Write a simulate the Traffic Signal light and also it should support Amber,Yellow and Orange which means
   Caution, Green means Proceed and Red means Stop.
 */
import java.util.Scanner;

public class Switich_Case_Or_Condition_Statement_03 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Traffic Signal Input: ");
		String tscode=sc.nextLine();
		tscode=tscode.toLowerCase();
		//char ch=tscode.charAt(0);
		
		switch (tscode)
		{
			
			case "amber":
			case "yellow":
			case "orange":
				System.out.println("CAUTION");
				break;
			case "green": 
				System.out.println("PROCEED");
				break;
			case "red": 
				System.out.println("STOP");
				break;	
			default:
				System.out.println("NOTE:-Invalid Trafic Signal");
				break;
				
		}
		
	}
}	
