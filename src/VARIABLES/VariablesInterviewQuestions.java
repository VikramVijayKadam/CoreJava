package VARIABLES;

public class VariablesInterviewQuestions 
{
	static String s1;

	public static void main(String[] args) 
	{
		//wap to 
		//1. print a local int variable, don't initialize 
	    //2. print value true
		//3. print value null
		//4. print value 100
		//5. print a reference variable (Static), don't initialize
		
		
		int i;
		//System.out.println(i); // local variable i should be initialized before use
		i=10;
		System.out.println(i);
		
		System.out.println(true);   // "true" is a string 
		//System.out.println(TRUE); // TRUE will be considered a variable 
		                            // compile time error(CTE)
		
		//System.out.println(null); //can't print value - null 
		
		System.out.println(100);  //"100" is a string
		System.out.println(s1);
		

	}

}

