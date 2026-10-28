import java.util.Scanner;
class TablePrint_function
{
	public   void PrintTable(int n)
	{
	System.out.println("print table method");
	   for(int i=1;i<=10;i++)
	   {
		   System.out.println(n+"x"+i+"="+n*i);
	   }
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		TablePrint_function obj=new TablePrint_function();
		 obj.PrintTable(n);//4
		
	}
}