package Basic_Array_Code;

public class Reverse_Array_Element {

	public static void main(String[] args)
	{
		//Declare an Array
		int a[]=new int[4];
		
		//Add values into an Array
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		
		//for reversing an Array in given elements
		for(int i=3;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
}
