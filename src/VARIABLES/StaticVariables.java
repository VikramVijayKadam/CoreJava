package VARIABLES;

class Orange1
{
	
}
public class StaticVariables 
{

		static int i=12;              // declared and initialized in same line -> works
		static Orange1 o2=new Orange1();
		static int h;                // only declared -> prints default value
		
	//	static int j;  
	//	j=20;
	// static variables can't be initialized in different line
	// initialization should be in the same line
	// if not initialized will take default value
		
		public static void main(String[] args) 
		
		{
			
		//	static double d; this will not works within the main methods it's scope is 
			                    //outside the main method or within the class 
		   System.out.println(i);
		   System.out.println(o2);
		   System.out.println(h);
		  // System.out.println(d);   // throws an exception -> Illegal modifier for parameter d; only final is permitted
		
	    }
		

}
