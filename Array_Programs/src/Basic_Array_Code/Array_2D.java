package Basic_Array_Code;

public class Array_2D {

	public static void main(String[] args) 
	{
		//declare an Array
		int a[][]=new int[3][2];
		
		//Add values into an Array
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		a[2][0]=50;
		a[2][1]=60;
		
		//declare size of an rows in an Array
		System.out.println("Length of rows an Array: " + a.length);
		
		//declare size of an columns in an Array
		System.out.println("Length of column of an Array: " + a[0].length);
		
		//declare array of first element of an Array
		System.out.println("Array of first element in an Array: " + a[0][0]);
		
		//declare multiple elements of an Array
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.println(a[i][j]);
			}
		}
	}

}
