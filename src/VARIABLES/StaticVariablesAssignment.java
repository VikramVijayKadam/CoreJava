package VARIABLES;

public class StaticVariablesAssignment 
{
	// without initialize prints defaults values this case works only for static variables 
	//but for non-static variable this case won't work
	
	static byte by;
	static short sh;
	static int in;
	static long lo;
	static float fl;
	static double du;
	static char ch;
	static boolean bo;
	
	byte by1;
	short sh1;
	int in1;
	long lo1;
	float fl1;
	double du1;
	char ch1;
	boolean bo1;
	
	public static void main(String[] args) 
	{
		//Write a program & declare all primitive variables as static, print the variables in main method
		//don't assign any values to variables 

		System.out.println(by);
        System.out.println(sh);
        System.out.println(in);
        System.out.println(lo);
        System.out.println(fl);
        System.out.println(du);
        System.out.println(ch);
        System.out.println(bo);
       
        StaticVariablesAssignment sva=new StaticVariablesAssignment();
        
        System.out.println();
        
        System.out.println("-----Printing Non-Static Variables default value by creating the instance of the class through reference variables");
		System.out.println(sva.by1);
        System.out.println(sva.sh1);
        System.out.println(sva.in1);
        System.out.println(sva.lo1);
        System.out.println(sva.fl1);
        System.out.println(sva.du1);
        System.out.println(sva.ch1);
        System.out.println(sva.bo1);
	}

}
