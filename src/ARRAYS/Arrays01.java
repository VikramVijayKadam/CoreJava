package ARRAYS;

public class Arrays01 
{

	public static void main(String[] args) 
	{
		int arr[]=new int[3];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		String arr1[]=new String[3];
		arr1[0]="I";
		arr1[1]="Love";
		arr1[2]="Java";
		for(String s:arr1)
		{
			System.out.println(s);
		}
		

	}

}
