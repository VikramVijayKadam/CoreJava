package OPERATORS;

public class RelationalOperatorType01
{

	public static void main(String[] args) 
	{
		int x=5,y=10;
		boolean res=x==y;
		
		System.out.println(res);  //false
		System.out.println(x==y); //false
		System.out.println(x==10); //false
		System.out.println(5==10); //false
		
		res =x!=y;
		//System.out.println('res');
		System.out.println(res);   //true
		
		res =x>y;
		System.out.println(res);   //false
		
		res =x>=y;
		System.out.println(res); //false
		
		res =x<y;
		System.out.println(res); //true
		
		res =x<=y;
		System.out.println(res); //true
		
		System.out.println(x=10); //10
		System.out.println(x==10); //true
		
		System.out.println("x="+x); //x=10
		System.out.println("x="+(x=123)); //x=123

		//System.out.println(TRUE); //cte, compiler will consider it as variable but variable is not declared.
		System.out.println(true); //true
		System.out.println(100);  //100
		
		int a=100, b=100, c=100; 
		//int i,j,k;
		//i=j=k=100;
		//int i=j=k=100; ------>>>Not possible
		
		//int l,m,n;
		//int l=10, m=20, n=30; ------>>>Not possible
		//l=m=n=30;
		
		//we can also have 
		//Orange o1,o2=new object(), o3,o4=new object();
		
		System.out.println("a = "+a+" b = "+b+" c = "+c); //a = 100 b = 100 c = 100
	}

}
