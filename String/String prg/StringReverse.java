class StringReverse
{
	public static void main(String[]args)
	{
		
		
		String str="pune";// 1 to create string
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
		
		str=new String(ch);
		System.out.println("After Reverse String str = "+str);
		
	}
}