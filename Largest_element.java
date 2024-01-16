package DSA;
// 3 largest element
// imp note ordering for storing value is important 
public class Largest_element 
{
	public static void main(String[] args) 
	{
		int arr[]= {3,20,7,10,1,55};
	    int flarge = 0,slarge=0,tlarge=0;
	    for(int i=1; i<arr.length; i++)
	    {
	    	if(flarge<arr[i])
	    	{
	    		// if this order has changed then answer not a optimal answer
	    		tlarge= slarge;
	    		slarge=flarge;
	    		flarge=arr[i];
	    	}
	    	else if(slarge<arr[i])
	    	{
	    		tlarge=slarge;
	    		slarge=arr[i];
	    	}
	    	else if(tlarge<arr[i])
	    	{
	    		tlarge=arr[i];
	    	}
	    }
	    System.out.println("largest element is :" + flarge + " "+slarge+ " "+tlarge);
	    
	}
}
