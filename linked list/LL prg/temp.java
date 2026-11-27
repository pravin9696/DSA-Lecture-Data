
class class1
{
	
}
class stud
{
	int i;//100
	float f;//3.14
	class1 obj;//hashcode  class1 obj
	public stud()
	{
		i=100;
		f=3.14f;
		obj=new class1();
	}
	public void show()
	{
		System.out.println("i "+i);
		System.out.println("f "+f);
		System.out.println("obj "+obj);
		System.out.println("obj hashcode= "+obj.hashCode());
	}
}
class temp
{
	public static void main(String[]args)
	{
		stud s=new stud();
		s.show();
	}
}