import java.util.Scanner;
class insertElementArray
{
	
	public static void main(String args[])
	{
		
		int[]a={11,22,33,44,0};
		  
		int index=5;   // index at which new element will be inserted
			int value=999;// new element
		   
		   System.out.println("\nArray elements are:\n");
			   for(int i=0;i<a.length;i++)//i=2    2<2
			   {
				  // if(a[i]!=0)
				   System.out.print(" "+a[i]);
			   }
		   
		   
		      // step1 check given index is valid or not
			  if(index<0 || index>=a.length)
			  {
				  System.out.println("\n Invalid index provided");
			  }
			  else
			  {
				  // shift all element to right side upto given index number
				  
				  for(int i=a.length-1;i>index;i--)
				  {
					a[i]=a[i-1];  
				  }
				  //copy element at given index
				  a[index]=value;
			  }
		   
		   
		   
			   // print array
			   System.out.println("\nArray elements are:\n");
			   for(int i=0;i<a.length;i++)//i=2    2<2
			   {
				  // if(a[i]!=0)
				   System.out.print(" "+a[i]);
			   }
			
			
			
			
				
				
			   
			   
	}
}