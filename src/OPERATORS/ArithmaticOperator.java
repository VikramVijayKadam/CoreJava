package OPERATORS;

public class ArithmaticOperator 
{

	public static void main(String[] args) 
	{
		//NOTE:- Whole Number=int & Real Number=double
		
		int i,j,k;
		i=30;
		j=20;
		k=i+j;
		
		System.out.println("Sum of i & j is "+k);            //50
		System.out.println("Sum of "+i+" and "+j+" is "+k ); //50
		
		k=i-j;
		System.out.println("Difference of i & j is "+k); //10

		k=i*j;
		System.out.println("Product of i & j is "+k);     //600
		System.out.println("Product of i & j is "+(i*j)); //600

		k=i/j;
		System.out.println("Division of i & j is "+k); //1
		
		int quotient=i/j;
		System.out.println("Quotient of i by j is "+quotient); //1
		
		double d=i/j;
		System.out.println(d);  //1.0
		
		d=30.0/20.0;
		System.out.println(d); //1.5
		
		d=30/20.0;
		System.out.println(d); //1.5
		
		System.out.println(30/20);  //1
		
		//k=30.0/20.0; //cte, can't assign double to int directly
		//System.out.println(k);
		
		int remainder=i%j;
		System.out.println("Remainder of i by j is "+remainder); //10
		
		System.out.println('A'+'B');          //Addition 65+66=131 ansi code value->131
		System.out.println('A'+"B");         //Concatenation ->AB
		System.out.println("Hello"+'A'+'B'); //Concatenate ->HelloAB
		System.out.println('A'+'B'+"Hello"); //Addition and concatenate ->131Hello
		System.out.println('A');             //Char->A
		System.out.println("A");            //String->A
		System.out.println('A'+'\n');      //Unicode value "\n" is 10 ->75
		System.out.println('A'+"\n");     // Concatenate since "\n" here is String-> print only A & cusor moves to next line
		System.out.println('A'+20);       //Addition ->65+20=85
		System.out.println("A"+20);      //Concatenate ->A20
		System.out.println("A"+'A');     //Concatenate ->AA
		System.out.println("A"+"A");     //Concatenate ->AA
		
		
		
		
		
		

	}

}
