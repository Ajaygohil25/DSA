package DSA;

import java.util.HashMap;
import java.util.Map;

// finding the maximum element out of array, which is greater than n/2 
public class Maximum_element 
{
    public static void main(String[] args) 
    {
    	System.out.println("program running----");
	    	int array[]= {5,7,5,5,2,3,5,6,5,5,7,5};
	    	int n=array.length;
	    	
	    	// approach 1st: time complexity O(n2) and space complexity o(n)
	    	
	    /*	for(int i=0; i<n; i++)
	    	{
	    		int frequency=0;
	    		for(int j=i+1; j<n; j++)
	    		{
	    			if(array[i]==array[j])
	    			{
	    				frequency++;
	    			}
	    		}
	    		if(frequency>=n/2)
	    		{
	    			System.out.println("Maximum frequency element is : "+array[i]+ " with frequency of  "+frequency );
	    		    break;
	    		}
	    	} */
	    	
	    	// approach 2 : use of hash map
	    /*	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	    	for(int i: array )
	    	{  
	    		map.put(i, map.getOrDefault(i, 0)+1); // map.getOrDefault() function stores unique value if key is not present in map then it will write 0 other wise increase the value of key with "+1"
	    	
	    	}
	    	for(Map.Entry<Integer, Integer> m: map.entrySet())
	    	{
	    		if(m.getValue() >n/2)
	    		{
	    			System.out.println("maximum  frequency element is : "+m.getKey()+" : " +m.getValue());
	    		}
	    	} */
	    	
	    	
	    	// approch -3 : Moore's vooting algorithm
	    	// if candidate  appears again then increase count, otherwise decrease count
	    	// if count reach to 0 after decrement then set candidate as array[i]
	    	int candidate = array[0];
	    	int count=1;
	    	// Moore algorithm 
	    	for(int i=1; i<n; i++)
	    	{
	    		if(array[i]==candidate)
	    		{
	    			count++;
	    		}
	    		else
	    		{
	    			count--;
	    		}
	    		
	    		if(count==0)
	    		{
	    			candidate= array[i];
	    			count=1;
	    		}
	    	}
	    	
	    	// reverify for checking if this candidate is actual maximum element or not
	    	
	    	int c=0;
	    	for(int i=0; i<n; i++)
	    	{
	    		if(array[i]==candidate)
	    		{
	    			c++;
	    		}
	    	}
	    	
	    	if (c>n/2)
	    	{
	    		System.out.println("maximum  element is "+candidate);
	    	}
	    	else
	    	{
	    		System.out.println("no maximum element "+ "-1");
	    	}
	    	
	    	
	     
	}
}
