package VARIABLES;

public class FinalVariableOrConstantVariable 
{

	static final double PI=3.14;
	//constant, value should be assigned in the same statement 
	
	
	public static void main(String[] args) 
	{
		final int NO_WHEELS; // if we use static final outside the main, we can't do this in different line 
		NO_WHEELS=6;//can be done in same line or different 
		
		
		System.out.println(PI);
		System.out.println(NO_WHEELS);
		//NO_WHEELS=8;  will not works, can't reassign, if we want to reassign we should remove Final modifiers
		//System.out.println(NO_WHEELS);
		

	}

}
