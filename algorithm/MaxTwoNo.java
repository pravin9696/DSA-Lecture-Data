import java.util.Scanner;
class MaxTwoNo
{
	public static void main(String[]args)
	{
	   Scanner sc=new Scanner(System.in);
	   int A,B;
	       System.out.println("Enter Two numbers");
	          A=sc.nextInt();
	          B=sc.nextInt();
			      if(A>B)//true
				  {
					  System.out.println(A+" is Greater");
				  }
				  else
				  {
				    if(B>A)
				     {
					   System.out.println(B+" is Greater");
				     }
				     else 
				      {
					   System.out.println("Both are equal");
				      }
				  }
	  
	  
	}
}