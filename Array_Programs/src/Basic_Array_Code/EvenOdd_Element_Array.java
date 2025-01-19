package Basic_Array_Code;

public class EvenOdd_Element_Array {

	public static void main(String[] args) 
	{
		//Declare an Array
		int a[]= new int[5];
		
		//Add values into an Array
		a[0]=10;
		a[1]=20;
		a[2]=33;
		a[3]=40;
		a[4]=55;
		
		//initialize even element array start from index 0
		int even=0;
		
		//initialize odd array element start from index 0
		int odd=0;
		
		for(int i=0;i<=4;i++)
		{
			if(a[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		
		System.out.println("No. of Even elements: " + even);
		System.out.println("No. of Odd elements: " + odd);
	}

}
