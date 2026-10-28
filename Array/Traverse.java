import java.util.Scanner;
class Traverse 
{
	public static void PrintArray(int [] temp)
	{
		System.out.println("Array Elements are :");
		 for(int i=0;i<temp.length;i++)
		 {
			 System.out.print("     "+temp[i]);
		 }
		
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter 5 elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		PrintArray(a);
		
		
	}
}