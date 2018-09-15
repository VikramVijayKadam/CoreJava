package Interview_Programs;

public class LargestDifferanceInArray 
{
	 int large_diff(int arr[], int size)
	 {
		 int I_diff=0;
		 for(int i=0;i<size-1;i++)
		 {
			 int diff=(arr[i]-arr[i+1]);
			 if(diff>I_diff)
			 {
				 I_diff=diff;
			 }
		 }
		 return I_diff;
	 }




	public static void main(String[] args) 
	{
	 int arr[]={40,10,20,5,7,8};
	 int size=arr.length;
	 LargestDifferanceInArray ln=new LargestDifferanceInArray();
	 System.out.println(ln.large_diff(arr, size));
	 

	}

}
