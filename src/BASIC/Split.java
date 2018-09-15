package BASIC;

public class Split 
{

	public static void main(String[] args) 
	{
		String str="This is Java Class";
		
		String arr1[]=str.split("");
		
		for(int i=arr1.length-1;i>=0;i--)
		{
			System.out.print(arr1[i]+" ");
		}
		


	}

}
