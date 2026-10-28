import java.util.Scanner;
class Search2 
{
	
	public static void main(String[]args)
	{
		int b[]={111,555,333,444,666};
		int i=0;
		int se=555;//Search Element
		int cnt=0;//count
		
		/*Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 5 elements");
		for(i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("Enter Searching Value");
		*/
		// Search logic
		
		 for(i=0;i<b.length;i++)
		 {
			 int temp=b[i];
			  if(temp==se)
			  {	
                cnt++;		  
				
			  }
			 
		 }
		
		 if(cnt==0)
		 {
			 System.out.println("Element Not Found!!!");
		 }
		  else
			  {
				 System.out.println("Element Found "+cnt+" Time"); 
			  }
		
		
	}
}