package ARRAYS;

import java.util.Arrays;

public class ReverseSecondHalfOfAnArray 
{

	public static void main(String[] args) 
	{
	  int arr[]={10,20,30,40,50,60};
	  int startindex=arr.length/2;
	  int endindex=arr.length-1;
	  int temp=0;
	  
	  for(int i=arr.length/2; i<arr.length-1;i++)
	  {
		  temp=arr[startindex];
		  arr[startindex]=arr[endindex];
		  arr[endindex]=temp;
		  
		  startindex++;
		  endindex--;		  
	  }
	  
	  System.out.println(Arrays.toString(arr));

	}

}
