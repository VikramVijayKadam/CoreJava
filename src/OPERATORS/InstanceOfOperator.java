package OPERATORS;

class Orangee
{
	
}
public class InstanceOfOperator 
{
	static Orangee o1;
	
	public static void main(String[] args) 
	{
	  System.out.println(o1);                                     //null
	  System.out.println(o1 instanceof Orangee);                 //false
	  
	  o1=new Orangee();
	  System.out.println(o1 instanceof Orangee);                //true
	  
	  o1=null;
	  System.out.println(o1 instanceof Orangee);                //false
	   
	  String s=new String("Hello");
	  if (s instanceof String)                                 //yes s is instance of string class
		  System.out.println("s is instanceof String Class");  
	  s=null;
	  if (!(s instanceof String))                             // since we have assigned null for s, so s is not a instance of string class
		  System.out.println("s is not instanceof String class");
	  

	}

}
