import java.util.Scanner;
class StringToArray
{
	public static void main(String[]args)
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		str=sc.next();
		char []chStr=str.toCharArray();
		System.out.println("hashcode of str :"+str.hashCode());
		
		
			
		System.out.println("Total Characters in String "+str+"  is :"+chStr.length);
		chStr[0]='*';
		str=new String(chStr);
		System.out.println("Total Characters in String "+str+"  is :"+chStr.length);	
		System.out.println("hashcode of str :"+str.hashCode());
		
		
	}
}