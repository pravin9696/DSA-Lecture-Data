/*
   WAP to delete given character from String
*/
class DeleteCharFromString
{
	public static void main(String[]args)
	{
		String str="abcde";  //str="acde"
		char c='a';
		
		//ste1  convert string to the array of characters
		
		  char []ch=str.toCharArray();
		
		//step2 
		  //search char into array
		  boolean flag=false;// char not in string 
		     for(int i=0;i<ch.length;i++)
			 {
				 if(c==ch[i])
				 {
					flag= true;// char in a string
					 // left shifting logic
					 
					 for(int j=i;j<ch.length-1;j++)
					 {
						 ch[j]=ch[j+1];
					 }
					 break;
				 }
			 }
		      if(flag==true)
			  {
			  str=new String(ch,0,ch.length-1);
			  
			  System.out.println("updated string = "+str);
	          }
			  else
			  {
				  System.out.println("char not found in a string!!");
			  }
		//step3
	}
}