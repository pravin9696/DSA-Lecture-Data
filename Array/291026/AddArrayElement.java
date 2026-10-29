import java.util.Scanner;
class AddArrayElement
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int[]a=new int[5];
		char ch;
		int ctr=0;//ctr==> counter ie actual elements in an array
		   int no;
		   /*
		       for(int i=0;i<a.length;i++)
			   {
				   System.out.println("Enter a no");
			    no=sc.nextInt();
				
				a[i]=no;
				ctr++;
			   }
			   */
			   
			   do
			   {
				  if(ctr>=a.length)
				  {
					  System.out.println("Array is Full..");
					  break;
				  }					  
				System.out.println("Enter a no");
			     no=sc.nextInt();				
				a[ctr]=no;
				ctr++;
				   System.out.println("Do you want to continue(y/n)");
				   ch=sc.next().charAt(0);
				   
			   }while(ch=='y'||ch=='Y');
			   // print array
			   for(int i=0;i<a.length;i++)//i=2    2<2
			   {
				  // if(a[i]!=0)
				   System.out.print(" "+a[i]);
			   }
				
				System.out.print(" Total elements are "+ctr);
				
				//add element at any position
				
				
				
			   
			   
	}
}