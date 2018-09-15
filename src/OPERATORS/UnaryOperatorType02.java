package OPERATORS;

public class UnaryOperatorType02 
{

	public static void main(String[] args) 
	{
		int i=0,j=0;
		j=i + i++ + i + i++;
		System.out.println("i="+i);  //prints-> i=2
		System.out.println("j="+j); //prints-> j=2
		
		int k=0,l=0;
		k=++l;
		System.out.println("k="+k); //prints-> k=1
		System.out.println("l="+l); //prints-> l=1
		
		

	}

}
