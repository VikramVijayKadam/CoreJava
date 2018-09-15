package CONTROL_STATEMENTS;

public class If_Statement_01 
{

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
	  int age;
	  age=16;
	  
	  if(age<18)
	  {
		  System.out.println("Not Eligible to Vote");
	  }

	  if(true)
	  {
		  System.out.println("true works");
	  }
	  
	  // if(age=16) we must use boolean expression in the if condition, assignment operator wont work
	  
	  if(age==16)
	  {
		  System.out.println("age==16 works, relational operator works because it returns boolean expression");
	  }
	  
	  if(!false)
	  {
		  System.out.println("!false works");
	  }
	  
	  if(false)
	  {
		  System.out.println("compile but condition false, CONDITION DOES NOT SATISFY SO THIS ONE DOES NOT PRINTS");
	  }
	  
	  boolean var=true;
	  
	  if(var)
	  {
		  System.out.println("Works and executes the statement");
	  }
	  
	  if(var=true)
	  {
		  System.out.println("var=true, Works and executes the statement");
	  }
	  
	  if(false);
	  {
		  System.out.println("If(false), End of Statement, block get executed irrespective whether the condition is true or false as it become independent");
	  }
	  
	}

}
