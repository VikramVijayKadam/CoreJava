package BRANCH_OR_DECISION_STATEMENTS;

import java.util.Scanner;

/**
 Write a java program to develop electrical billing application by considering the following requirements.
 accept number of units from the user.
 1. If units <=50 units, cost =1.2 per unit.
 2. For the next 50 units, cost =2.4 per unit.
 3. For the next 50 units, cost =3.60 per unit.
 4. If units>=150, cost =4.80 per unit.
 5. If units consumed>200 units give discount of 5%. If the discount crosses 200 then limit the discount to 200.
    accept arrears if any & put 10% fine.
 
         Total amount = amount + arrears + fine - discount
 * @author Vikram Vijay Kadam
 *
 */

public class if_Else_Statement_04_Assignment 
{

	public static void main(String[] args) 
	{
		double a=bill();
		System.out.println("Total Bill Amount ="+a);
	}
    
	static double bill()
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Units Consumed :");
		double unit=sc.nextDouble();
		
		System.out.println("Enter Arrears(If any) :");
		double arrears=sc.nextDouble();
		
		double amount=0.0;
		double interest=0.0;
		double discount=0.0;
		
		if(unit>=0 && unit<=50)
			amount=unit*1.2;
		else if(unit>50 && unit<=100)
			amount=(50*1.2)+(unit-50)*2.4;
		else if(unit>100 && unit<=150)
            amount=(50*1.2)+(50*2.4)+(unit-100)*3.6;
		else if(unit>150)
		{
			amount=(50*1.2)+(50*2.4)+(50*3.6)*(unit-150)*4.80;
					if(unit>200)
					{
						discount=amount*0.05;
						if(discount>200)
						discount=200;
					}
		}
		else
			System.out.println("Invalid Data Input");
		
	if(arrears>=0)
		interest=arrears*0.1;
	double total=amount + arrears +interest-discount;
	System.out.println("===================================================================");
	System.out.println("Bangalore Electricity Supply Company Limited");
	System.out.println("(Wholly owned by Govt. of Karnataka)");
	System.out.println("Corporate Office, K R Circle, Bangalore 560 001, Karnataka, India");
	System.out.println("===================================================================");
	System.out.println("Monthly Bill ="+amount);
	System.out.println("Arrears (if any) ="+arrears);
	System.out.println("Interest ="+interest);
	System.out.println("Discount ="+discount);
	System.out.println("=============================");
	return total;
}
}
