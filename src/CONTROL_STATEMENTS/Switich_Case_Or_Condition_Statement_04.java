package CONTROL_STATEMENTS;
/*
   Demo for using switch case for string
 */
import java.util.Scanner;

public class Switich_Case_Or_Condition_Statement_04 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Country Code: ");
		String ip=sc.nextLine();
		ip=ip.toUpperCase();
		
		switch (ip)
		{
			
			case "ind":
				System.out.println("INDIA");
				break;
			case "jpn":
				System.out.println("JAPAN");
				break;
			case "ame":
				System.out.println("AMERICA");
				break;
			case "chn": 
				System.out.println("CHINA");
				break;
			default:
				System.out.println("Invalid Country Code");
				break;
				
		}
		
	}
}	
