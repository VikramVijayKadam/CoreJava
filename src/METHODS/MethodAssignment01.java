package METHODS;

public class MethodAssignment01 
{
	static int addtion(int n1, int n2)
	{
		int a=n1+n2;
		return a;
	}
	
	static int multiple(int n1, int n2)
	{
		int a=n1*n2;
		return a;
	}
	
	static int subract(int n1, int n2)
	{
		int a=n1-n2;
		return a;
	}
	
	static int divide(int n1, int n2)
	{
		int a=n1/n2;
		return a;
	}
	
	static String printy(String n2)
	{ 
		String n1="hello"+n2;
		return n1;
	}
	
	static int[] marks()
	{
		int getMarks[]={10,20};
		return getMarks;
	}
	
	public static void main(String[] args) 
	{
	 System.out.println(addtion(10,20));	
	 System.out.println(multiple(20,10));
	 System.out.println(subract(100,50));
	 System.out.println(divide(35,5));
	 System.out.println(printy(" vikram"));
     System.out.println(marks());
	}

}
