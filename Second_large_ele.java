	package DSA;
	
	import javax.swing.plaf.SliderUI;
	
	//Find Second largest element in an array
	public class Second_large_ele 
	{
	    public static void main(String[] args) 
	    {
		  	int arr[]= {2,6,10,15};
		  	int large_int = 0;
		  	int s_large=0;
		  	
		  	for(int i=0; i<arr.length; i++)
		  	{
		  		if(large_int<arr[i])
		  		{
		  			s_large= large_int;
		  			large_int=arr[i];
		  		}
		  	}
		  	
		  	System.out.println("largest element is : "+large_int) ;
		  	System.out.println("second largest element is : "+s_large) ;
		}
	} 
