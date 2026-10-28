/*
Q4. Write a method displayResult(int marks) that prints "Pass" if marks >= 40, otherwise "Fail".
*/
import java.util.Scanner;
class Result
{
	public static void GetResult(int tm)
	{
		int totalMarks=tm;
		if(totalMarks>=40)
		{
			System.out.println("Pass");
		}
		else			
			{
				System.out.println("Fail!!!");
			}		
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		  int M;
		  System.out.println("Enter a marks");
		  M=sc.nextInt();//80
		  GetResult(M);		  
	}
}