package Basic_Array_Code;

public class Array_1D {

	public static void main(String[] args) 
	{
		//Create an Array
		int a[]=new int [3];
		
		//Add values into an Array
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		//Find the length of an Array
		System.out.println("Length of an Array is : " + a.length);
		
		//display single element of an Array
		System.out.println("Array of first element is : " + a[0]);
		
		//display all values from an Array
		//using for-loop
		for(int i=0;i<=2;i++)
		{
			System.out.println(a[i]);
		}
	}
}
