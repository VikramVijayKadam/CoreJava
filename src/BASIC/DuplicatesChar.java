package BASIC;

public class DuplicatesChar 
{
	public static void main(String args[]) {
	    char Char;
	    int count;
	    String a = "Hi my name is Rahul aaaaaaaaaa";
	    a = a.toLowerCase();
	    
	    for (Char = 'a'; Char <= 'z'; Char++) 
	    {
	        count = 0;
	        for (int i = 0; i < a.length(); i++) 
	        {
	            if (a.charAt(i) == Char) 
	            {
	                count++;
	            }
	        }
	        if(count>=2)
	        System.out.println("Number of occurences of " + Char + " Char is " + count);
	    }
	}

}
