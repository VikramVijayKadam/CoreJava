package Interview_Programs;
/*
 * note:-
 * String x="abc";  this is immutable
 * 
 * String Buffer, we can create modifiable string and all public method are synchronized and only one thread
 * and it is thread saver but, it makes a program slow to exceute
 * 
 */
import java.util.Arrays;
import java.util.Scanner;

public class Anagram 
{
	public static boolean isAnagram(String word, String anagram)
	{
		char[] wordArr=word.toCharArray();
		char[] anagramArr=anagram.toCharArray();
		Arrays.sort(wordArr);
		Arrays.sort(anagramArr);
		
		return Arrays.equals(wordArr, anagramArr);
	}

	public static void main(String[] args) 
	{
	  @SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the First Word :-");
	  String word=sc.nextLine();
	  @SuppressWarnings("resource")
	Scanner sc1=new Scanner(System.in);
	  System.out.println("Enter the Second Word :-");
	  String anagram=sc1.nextLine();
	  
	  System.out.println("The above Two string are Anagram String, check "+ Anagram.isAnagram(word, anagram));
	}
}

/*
 * Enter the First Word :-
 * qwertyuiop
 * Enter the Second Word :-
 * poiuytrewq
 * The above Two string are Anagram String, check true
 * ------------------------------------------------------
 * Enter the First Word :-
 * ASDFGHJK
 * Enter the Second Word :-
 * SDFGHJK
 * The above Two string are Anagram String, check false
 * 
 * 
 * 
 */

