import java.util.Scanner;
class isPrimeOrNot
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
		Scanner sc=new Scanner(System.in);
		int n;
		 System.out.println("Enter a Number");
		 n=sc.nextInt();
		 
		boolean result=isPrime(n);//11
		if(result==true)
		{
			System.out.println(n+" is prime no");
		}
		else
		{
			System.out.println(n+" is Not prime no!!!!");
		}
	}
}