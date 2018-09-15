package VARIABLES;

class oranges
{
	
}
public class LocalVariable {

	public static void main(String[] args) {
		int i;   //Declaration of local variable i
		i=10;   //Local Variable should be initialized before using
		
		System.out.println("i="+i);
		
		String s =null;
		oranges o1=null;
		char ch='\u0000';
		
		System.out.println(s);  // prints -> null
		System.out.println(o1); // prints -> null
		System.out.println(ch+"no char");   //prints -> nothing for ch

	}

}
