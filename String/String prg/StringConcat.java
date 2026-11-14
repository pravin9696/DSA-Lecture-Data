/*
5. Concatenating two strings       
   str1="pune"   str2="Talegaon"    str1="puneTalegaon"
*/
class StringConcat
{
	public static void main(String[]args)
	{
		String str1="Maharashtra";//4 char
		String str2="Pune"; //8 char
		//str1=str1+str2;
		
		  //step1 convert string into Array of characters
		  char []ch1=str1.toCharArray();
		  char[]ch2=str2.toCharArray();
		  char[]ch3=new char[ch1.length+ch2.length];// 4 char+ 8 char
		  
		  
		  // step2 apply logic
		  //copy ch1 elements into result array
		    
		     for(int i=0;i<ch1.length;i++)
			 {
	              ch3[i]=ch1[i];
			 }
			 
			 // copy ch2 array into result array
			 int j=ch1.length;
			 for(int i=0;i<ch2.length;i++)
			 {
				 ch3[j]=ch2[i];
				 j++;
			 }
		  
		  //step3 convert array of characters into string again
		
		   str1=new String(ch3);
		
		
		
		
		
		
		System.out.println("Result ="+str1+" Length ="+str1.length());
	}
}