package aliquot;
/*
 * program to find the aliquot sum of a given number
 */
import java.util.Scanner;// Scanner Class
public class Aliquot 
{
	static int i;
	int n;
	int sum;	
	//Method For Checking Perfect Numbers between 1 to 100
	void perfect()
	{
		System.out.println("Perfect Numbers Between 1 to 100:-");
		for(n=1;n<=100;n++)
		{
			i=1;
			sum = 0;
			while(i<n)
			{
				if(n%i==0)
					sum=sum+i;
				i++;
			}
			if(sum==n)
				System.out.println(n);
		}
	}
	public static void main(String[] args)// Start of Main Class
	{
		Aliquot a=new Aliquot();// Creating Object of Aliquot Class
		Scanner sc = new Scanner(System.in);// Creating Object of Scanner Class
		System.out.println("Enter the Number");
		int number = sc.nextInt();    //User Input of Number 
		int aliquot_sum;
		aliquot_sum=0;
		System.out.println("The Aliquot Divisors of " + number+ " are= ");
		//Check whether the given number's  aliquot sum is Perfect number or not *
		for(i=1; i<number; i++)
		{
			if(number%i == 0)
			{        	 
				aliquot_sum += i;             
				System.out.println(i);
			}         
		}    
		System.out.println("The Aliquot Sum of "+number+ " is= " +aliquot_sum);
		//Checking Given Number is perfect number or not
		if(aliquot_sum== number)
		{
			System.out.println(number+ " is a perfect number.");           
		}
		else
		{
			System.out.println(number +" is not a perfect number.");
		}
		a.perfect();// Function Call for Printing all Perfect Number between 1 to 100
		sc.close();// Scanner Object Close
	}// Close of Main Class
}