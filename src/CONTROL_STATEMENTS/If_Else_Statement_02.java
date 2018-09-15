package CONTROL_STATEMENTS;

public class If_Else_Statement_02 
{

	public static void main(String[] args) 
	{
	    int a=10, b=20, c=30;
	    
	    if(a>b && a>c)
	    	System.out.println(a+" is greater than " +b+ " and "+c);
	    
	    else if(b>a && b>c)
	    	System.out.println(b+ " is greater than "+a+ " and "+c);
	    
	    else if(c>a && c>b)
	    	System.out.println(c+ " is greater than "+a+" and "+b);
        
	    else 
	    	System.out.println(a+b+c +"are equal");
	}

}

//Note:-
//1. If statement can be used without an else statement.
//2. Multiple if..else statements can be used in a program.
//3. Once an if..else statement causes an action in a program then the remaining if_else statements will be ignored.