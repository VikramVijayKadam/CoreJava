package CONTROL_STATEMENTS;

public class Lshape 
{
	public static void main(String[] args) 
	{
	
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=5;j++)
			{
				if(j==1 || (i>=5 && j>1))
				System.out.print("*" +" ");
			}
			System.out.println();
		}
	}

}
