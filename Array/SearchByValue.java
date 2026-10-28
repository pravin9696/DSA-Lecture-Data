import java.util.Scanner;
class SearchByValue 
{
	
	public static void main(String[]args)
	{
		int b[]=new int[5];
		int i=0;
		int se;//Search Element
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 5 elements");
		for(i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("Enter Searching Value");
		
		// Search logic
		
		 for(i=0;i<b.length;i++)
		 {
			 int temp=b[i];
			  if(temp==se)
			  {				
				break;
			  }
			 
		 }
		
		 if(i==b.length)
		 {
			 System.out.println("Element Not Found!!!");
		 }
		  else
			  {
				 System.out.println("Element Found at "+i); 
			  }
		
		
	}
}