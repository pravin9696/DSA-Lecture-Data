/*
Q1 Write a method max(int a, int b) that returns the larger of two numbers.
*/
import java.util.Scanner;

class PrimeNo
{
	public static  boolean isPrime(int num)
	{
		boolean flag=true;//true==> prime no false==> not prime
		  for(int i=2;i<num/2;i++)//11/2===>5
		  {
			  // num is divisible by i
			  if(num %i==0)
			  {
				flag=false;
                 break;				
			  }
		  }
		  return flag;
	}
	
	public static void main(String[]args)
	{
		int no;
		boolean status; 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		no=sc.nextInt();
		status=isPrime(no);
               if(status==true)
		System.out.println(no+" is Prime Number");
		   else
			System.out.println(no+" is NOT Prime Number!!!");
	}
}










