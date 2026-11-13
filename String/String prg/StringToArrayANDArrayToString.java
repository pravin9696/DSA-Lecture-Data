class StringToArrayANDArrayToString
{
	public static void main(String[]args)
	{
		String str="pune";//"zune"
		// convert into Array of Characters
		char[]ar=str.toCharArray();
		
		System.out.println("length of Array ar="+ar.length);
		System.out.println(ar);
		
		ar[0]='z';
		System.out.println("length of Array ar="+ar.length);
		System.out.println(ar);
		
	}
}