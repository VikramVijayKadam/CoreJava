package ARRAYS;

import java.util.Arrays;

public class ReverseFirstHalfOfAnArray 
{

	public static void main(String[] args) 
	{
	  int arr[]={10,20,30,40,50,60};
	  int startindex=0;
	  int endindex=(arr.length/2)-1;
	  int temp=0;
	  
	  for(int i=0; i<(arr.length/2)-1;i++)
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
