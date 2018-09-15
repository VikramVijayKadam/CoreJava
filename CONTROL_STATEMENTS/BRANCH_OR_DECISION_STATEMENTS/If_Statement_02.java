package BRANCH_OR_DECISION_STATEMENTS;

public class If_Statement_02 
{

	public static void main(String[] args) 
	{
		int age;
		age=16;
		
		if(age<18)   //Take only one line after if statement
			System.out.println("Not Eligible to work");
		age=age+2;
		System.out.println("age="+age);

	}

}

//Note:-
//       In the above case only statement next to "if" is executed, if the expression is true, the other statement
//   gets executed as usual
