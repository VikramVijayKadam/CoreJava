package Interview_Programs;

import java.util.Arrays;

public class SecondLargestNumberInAnArray 
{
	public static int second_largest(int arr[], int size)
	{
		int F_largest=arr[0];
		int S_largest=arr[0];
		
		for(int i=0;i<size;i++)
		{
			if(arr[i]>F_largest)
			{
				S_largest=F_largest;
				F_largest=arr[i];
				//System.out.println("small ="+S_largest);
				//System.out.println("large ="+F_largest);
			}
		}
		
		return S_largest;
	}
	
  public static void main(String[] args) 
	{
		int arr[]={400,300,20,5,7,8};
		 Arrays.sort(arr);
		 int size=arr.length;
		 int d=SecondLargestNumberInAnArray.second_largest(arr, size);
		 System.out.println("Second Largest Number in an Arrays is ="+d);
	}

}
