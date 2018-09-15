package METHODS;

public class MethodType01 
{

	public static void main(String[] args) 
	{
	   print();
	   
	   int tot=sum(10, 20);
	   System.out.println(tot);
	   
	   System.out.println(sum(100,200));
	   
	   sum(123,456);
	   System.out.println(sum(sum(123,456),sum(111,222)));
	   
	   System.out.println(avgTemp(22.6,26.4));
       
	   String s2=(wish(" lolly"));
	   System.out.println(s2);
	   
	   System.out.println(wish(" vicky"));
	}
	
	static void print()
	{
		System.out.println("I love you");
		
	}
   
	static int sum(int n1,int n2)
	{
		int total=n1+n2;
		return total;
	}
	
    static double avgTemp(double t1, double t2)
    {
    	double avg=(t1+t2)/2;
    	return avg;
    } 
    
    static String wish(String s1)
    {
    	String s2=("Hello"+s1);
    	return s2;
    }
}
