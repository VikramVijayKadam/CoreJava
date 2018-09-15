package OPERATORS;

public class ConditionalOperatorType01
{

	public static void main(String[] args) 
	{
		int x=10;
		int y=x>12?100:200;
		System.out.println(y);                   //Prints->200
		
		@SuppressWarnings("unused")
		char ch=12.34==12.3?'A':'B';
		System.out.println(ch);                 //Prints->B
		
		int mark=55;
		String res=mark>50?"PASS":"FAIL";
		System.out.println(res);                //Prints->PASS

	}

}
