package Basic_Array_Code;

import java.util.Arrays;

public class Sort_Array_Element {

	public static void main(String[] args) 
	{
		//Declare an Array
		int a[]=new int [4];
		
		//Add values into an Array
		a[0]=40;
		a[1]=20;
		a[2]=2;
		a[3]=1;
		
		//before sorting an Array in given elements
		System.out.println("Before sorting an Array elements: " + Arrays.toString(a));
		
		//to sort an Array in given elements
		Arrays.sort(a);
		
		//after sorting an Array in given elements 
		System.out.println("After sorting an Array: " + Arrays.toString(a));
	}
}
