package OPERATORS;

class Orange
{
	
}
public class RelationalOperatorType02 
{

	public static void main(String[] args) 
	{
	  int x=5,y=10;
	  System.out.println(x==y); //false 
	  System.out.println(x==5); //true
	  System.out.println(10==y); //true
	  System.out.println(10==5);  //false
	  
	  Orange o1=new Orange(), o2=new Orange();
	  System.out.println(o1);   //prints address of o1
	  System.out.println(o2);   // prints address of o2
	  System.out.println(o1==o2);//false
	  System.out.println(o1!=o2);//true
	  //System.out.println(o1>o2);  cte
	  System.out.println(x>y);//false
	  o1=o2;
	  System.out.println(o1);//prints address of o2
	  System.out.println(o2);//prints address of o2
	  System.out.println(o1==o2); //true
	  o1=null;
	  o2=null;
	  System.out.println(o1==o2); //true
	}

}
