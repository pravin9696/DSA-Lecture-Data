class UpdateArrayElement2
{
	//logic to update  element from array
	public static void main(String args[])
	{
		int[]a=new int[]{11,22,33,44,55};
		int oldNo=111;
		int newNo=999;
			System.out.print("\n array before replace\n");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		//task1 search 33 in array
		int flag=0;// 0==> not found  1==> found
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==oldNo)// element found in array
			{
				//task2 replace old value by new value
				a[i]=newNo;
				flag=1;
				//break;
			}
		}
		  if(flag==1)
		  {
			  	System.out.println("\n Element replaced successfully...");
		  }
		  else
		  {
			  	System.out.println("\n Element not found!!!");
		  }
		// print array element
		System.out.print("\n array after replace\n");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}