package BRANCH_OR_DECISION_STATEMENTS;

public class If_Statement_03 
{

	public static void main(String[] args) 
	{
		int age;
		age=16;
		
		if(age<18)
		{
			System.out.println("Not Eligible to vote");
			
			age=age+2;
			System.out.println("Age of the person is "+age);
		}

	}

}
// Note:-
//        If we change age to 18 or more, the next statement will not be executed. In order to welcome the confusion 
//it is recommended +to use curly braces enclosing the if block statements.