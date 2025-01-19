package Basic_Array_Code;

public class Average_Element_Array {

	public static void main(String[] args) 
	{
		//Declare an Array
		int a[] = new int[4];
		
		//Add values into an Array
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		
		int avg=0;
		int sum=0;
		
		for(int i=0;i<=3;i++)
		{
			sum=sum+a[i];
			avg=sum/a.length;
		}
		
		//Average element of an given Array
		System.out.println("Average element of an given Array: " + avg);
	}

}
