package DSA;
// shift all zeros
public class Shift_zero 
{
  public static void main(String[] args) 
  {
	int arr[]= {1,0,5,0,4};
	int count=0;
	
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i]!=0) 
		{
			arr[count++]= arr[i]; 
			
		}
		
	}
	while (count<arr.length)
	{
		System.out.println("value of count "+count);
		arr[count++]=0;
	}
	System.out.println("array after implementation: ");
	for(int i: arr)
	{
		System.out.print(i + " ");
	}
	
  }
}
