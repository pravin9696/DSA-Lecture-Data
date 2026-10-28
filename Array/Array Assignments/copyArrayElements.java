/*
1) Write a program to copy one array to another array.
*/
import java.util.Scanner;
class copyArrayElements
{
	
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		int []b=new int[a.length];
		System.out.println("Enter "+a.length+" elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		//logic to transfer all elements into b
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		System.out.println("Array B elements are: \n");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(" "+b[i]);
		}
	}
}