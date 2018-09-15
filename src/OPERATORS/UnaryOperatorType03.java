package OPERATORS;

public class UnaryOperatorType03 
{

	public static void main(String[] args) 
	{
		int i=0,j=1;
		int k=i + j++ + ++i + ++j + i++;
		
		System.out.println("i="+i); //prints->i=2
		System.out.println("j="+j); //prints->j=3
		System.out.println("k="+k); //prints->k=6

	}

}
