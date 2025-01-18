package Basic_Array_Code;

public class Search_Element_Given_Array {

	public static void main(String[] args) 
	{
		//Declare an Array
		int a[]=new int[4];
		
		//Add values into an Array
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		
		//Search element in an given Array
		int searchelement=10;
		boolean status=false;
		
		for(int i=0;i<=3;i++)
		{
			if(searchelement==a[i])
			{
				System.out.println("Element found in an Array");
				status=true;
			}
			if(status==false)
			{
				System.out.println("Element not found in an Array");
			}
		}
	}
}
