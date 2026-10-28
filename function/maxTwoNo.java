/*
Q1 Write a method max(int a, int b) that returns the larger of two numbers.
*/
import java.util.Scanner;
class maxTwoNo
{
	                     //10      20
	public static int max(int a,int b)
	{
		 if(a>b)
		 {
			 return a;
		 }
		 else
		 {
			 return b;
		 }
	}
	public static void main(String[]args)
	{
		int x,y;
		int mx;//to store max variable 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		x=sc.nextInt();
		y=sc.nextInt();
		      //10,20
		mx=max(x,y);
		System.out.println("Maximum number ="+mx);
	}
}










