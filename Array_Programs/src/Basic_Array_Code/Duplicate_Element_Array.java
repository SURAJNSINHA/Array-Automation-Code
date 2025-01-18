package Basic_Array_Code;

public class Duplicate_Element_Array {

	public static void main(String[] args) 
	{
		//Declare an Array
		int a[]=new int[4];
		
		//Add values into an Array
		a[0]=100;
		a[1]=200;
		a[2]=200;
		a[3]=400;
		
		int duplicate_element=200;
		
		for(int i=0;i<=3;i++)
		{
			if(a[i]==duplicate_element)
			{
				System.out.println("Duplicate of an Array: " + duplicate_element);
			}			
		}
	}
}
