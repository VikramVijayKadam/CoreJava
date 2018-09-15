package OPERATORS;

public class ConditionalOperatorType03 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		float result=true?1.0f:2.0f;
		System.out.println(result);
		
		@SuppressWarnings("unused")
		float result1=false?1.0f:2.0f;
		System.out.println(result1);
		
		@SuppressWarnings("unused")
		String result2=false?"Dude, It's True":"Sorry Dude, It's False";
		System.out.println(result2);
		
		
		int i=10, j=20;
		System.out.println(i>j?i+" is Greater than "+j:j+" is Greater than "+i);
		
	}

}
