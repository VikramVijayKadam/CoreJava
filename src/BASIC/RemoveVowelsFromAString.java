package BASIC;

import java.util.Scanner;

public class RemoveVowelsFromAString 
{
    public static boolean isVowel(char ch)
    {
        switch(ch)
        {
          case 'A': case 'E': case 'I': case 'O': case 'U':
              return true;
          default:
              return false;           
        }
    }
     
    public static void main(String args[])
    {
        @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :- ");
    	String text=sc.nextLine().toUpperCase();
        String text1="";
        char ch;
         
        System.out.println("String before removing vowels: " + text);
         
        for(int i=0; i<text.length(); i++)
        {
            ch=text.charAt(i);
            if(!isVowel(ch))
            {
                text1+=ch;
            }
        }           
        System.out.println("String after removing vowels: " + text1);
    }
}
