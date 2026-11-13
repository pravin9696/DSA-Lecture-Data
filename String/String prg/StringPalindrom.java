class StringPalindrom
{
	public static void main(String[]args)
	{
		
		
		String str="nitin";// 1 to create string
		System.out.println("Before Reverse String str = "+str);
		//step1
		char[] ch=str.toCharArray();
		
		int i=0;//starting index
		
		int j= ch.length-1;  //last index
		
		// logic to reverse array of characters
		
		//step 2
		while(i<j)
		{
			//swaping logic
                char temp=ch[i];
                     ch[i]=ch[j];
                     ch[j]=temp;
                  i++;
                  j--;				  
		}
		
		
		//step3
		
		String str2=new String(ch);
		System.out.println("Reverse String str2 = "+str2);
		//compare str and str2
		 if(str.compareTo(str2)==0)
		 {
			 System.out.println("Palindrom");
		 }
		 else
		 {
			 System.out.println("Not Palindrom!!!");
		 }
		
	}
}