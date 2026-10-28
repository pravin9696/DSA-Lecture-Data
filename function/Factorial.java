/*
WAP to find factorial of given number using function accepting parameter and returning value technique

            5!= 5*4*3*2*1==
			     1*2*3*4*5==>
*/
import java.util.Scanner;
class Factorial
{
	public static  int getFactorial(int no)
	{
		int fact=1;
		for(int i=no;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		
		System.out.println("Enter a number");
		n=sc.nextInt();		
		   int f= getFactorial(n);//function calling
		   System.out.println("Factorial ="+f);
		
	}
}