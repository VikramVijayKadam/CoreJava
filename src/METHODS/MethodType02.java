package METHODS;

class Orangees
{
	
}
class Applees
{
	
}
public class MethodType02 
{

	public static void main(String[] args) 
	{
	  
      System.out.println(print1());
      System.out.println(print2());
      System.out.println(print3());
      System.out.println(isMarried());
      System.out.println(wish("vikram"));
      System.out.println(getOrangees());
      System.out.println(getApplees());
      System.out.println(getMarks());
      System.out.println(getOrangeess());
      
      System.out.println("--------------------");
      
      Orangees o1=getOrangees();
      System.out.println(o1);
      
      Applees a1=getApplees();
      System.out.println(a1);
      
      int m[]=getMarks();
      System.out.println(m);
      
      Orangees[] o2=getOrangeess();
      System.out.println(o2);
      
	}
     
	static void print()   //method does not return anything
	{		
		return ;   //return is OPTIONAL
	}
	
	static byte print1()
	{
	    byte b=25;
	    return b;
	}
	
	static int print2()
	{
		int i = 100;
		return i;
	}
	
	static char print3()
	{
	    return 'A';	
	}
	
	static boolean isMarried()
	{
		boolean status=false;
		return status;
	}
	
	static String wish(String name)
	{
		return "Hello "+name; 
	}
	
	static Orangees getOrangees()
	{
		return new Orangees();
	}
	
	static Applees getApplees()
	{
		Applees a1=new Applees();
		return a1;
	}
	
	static int[] getMarks()
	{
		int marks[]={70,80,85,90};
		return marks;
	}

	static Orangees[] getOrangeess()
	{
		Orangees o1=new Orangees();
		Orangees orang[]={new Orangees(), new Orangees(), o1};
		return orang;
	}
}
