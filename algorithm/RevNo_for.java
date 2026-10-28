/*
Write a program to reverse the digits of an integer using for loop.
           no=1234    o/p=4321
*/
import java.util.Scanner;
class try123
{
	public static void main(String[]args)
	{
		int no;
		int revNo=0;//result store
		int temp;
		boolean flag=true; //true==> +ve no false==> -ve
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		no=sc.nextInt();//-1234
		if(no<0)//true
		{
			no=no*-1;// 1234
			flag=false;//true
		}
		
		
		
		 for(;no>0;)//1234
		 {
		   //step1 collect last digit from no and store
            // into variable temp
			temp=no%10;//4
			//step2 multiply revNo by 10 and add temp
			
			revNo=revNo*10+temp;
			
			//step3 remove last digit from no
			  no=no/10;
		 }
		 if(flag==false)//flag=false
		 {
			 revNo=revNo*-1;
		 }
		 System.out.println("Rev Number = "+revNo);
		
	}
}