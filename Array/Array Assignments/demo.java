class stud
{
	
}
class demo
{
	public static  void showArray(int []aa)
	{
				System.out.println();
		for(int i=0;i<aa.length;i++)
		{
			System.out.print(" "+aa[i]);
		}
	}
	public static void main(String[]args)
	{
		int []b=new int[]{111};
		
		showArray(b);
		
	}
}