import java.util.Scanner;
class revNo
{
	public static void main(String[]args)
	{
	   Scanner sc=new Scanner(System.in);
	   int n,no;
	   n=0;
	       System.out.println("Enter a number");
	          no=sc.nextInt();
	          
			  while(no>0)
			  {
				  
				  int ld=no%10;
				  n=n*10+ld;
				  no=no/10;
				  
			  }
			  
				  System.out.println("rev ="+n);
			  
	}
}