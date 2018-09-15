package BASIC_JAVA;

public class practice {

	static int callme(int num)
	{
		if(num<5)
		{
			callme(num);
			System.out.println(num);
			return num;
		}
		else
		{
			return 1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(callme(1));

	}

}
