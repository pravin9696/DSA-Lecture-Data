/*
1) WAP to find area of circle
    1) without using function
	2) using function
*/
import java.util.Scanner;
class AreaCircle
{
	public static void main(String[]args)
	{
		//step 1 find all variable 
		//step 2 find data type of variables
		 float area;
		 float r;//8 bytes
		 String str;
		 Scanner sc=new Scanner(System.in);
		 
		 //area=3.14f*r*r;
		 //step3 accept input from user
		 System.out.println("Enter radius of Circle");		 
		    r= sc.nextFloat();
		//step4 calculate area of circle
        area=3.14f*r*r;	

         //step5 display result with message
		 
		  System.out.println("Area of Circle="+area);
	}
}