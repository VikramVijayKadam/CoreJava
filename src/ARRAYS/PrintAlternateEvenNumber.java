package ARRAYS;

public class PrintAlternateEvenNumber 
{

	public static void main(String[] args) 
	{
	  for(int i=0; i<=100;i++)
	  {
		  if(i%2==0)
		  {
			  System.out.println(i);
			  i+=2;
		  }
	  }
	  
	  System.out.println("-----------------");
	  
	  boolean flag=true;
	  for(int i=2;i<=100;i++)
	  {
		  if(i%2==0)
		  {
			  if(flag)
				  System.out.println(i);
			  flag=!flag;  
		  }
	  }

	}

}
