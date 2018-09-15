package BASIC_JAVA;

public class factorial {
  
	
	static long fact(long num)
	{
		if(num==0)
		{
			return 1;
		}
		else
		{
			return num*fact(num-1);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(fact(15));
	}
}
