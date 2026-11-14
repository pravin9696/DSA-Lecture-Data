import java.util.Scanner;
class StringLengthCount
{
	public static void main(String[]args)
	{
		 String str;
		 Scanner sc=new Scanner(System.in);
           System.out.println("Enter a String");
		   str=sc.nextLine();
		   
            //step1
           char[]ch=str.toCharArray();// convert String into Array of characters


              //step2
                  int cnt=0;
             for(int i=0;i<ch.length;i++)
                {
                    cnt++;
                }
                   System.out.println("Total Characters are/ length is  :"+cnt);//
	}
}