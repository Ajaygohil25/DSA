package DSA;

import java.util.HashSet;
import java.util.Set;

// here sum of three element should be equal to target 
public class SumEqualToTarget 
{
    public static void main(String[] args) 
    {
		int arr[]= {-1,-1,1,2,2,2,3,3,4,4,6};
		int n=arr.length;
		int target= 6;
		Set <Object> set= new HashSet<Object>();
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				
				for(int k=j+1; k<n; k++)
				{
					
					if(arr[i]+arr[j]+arr[k]==target && !set.contains(arr[i]+ " "+arr[j]+ " "+arr[k]))
					{
						System.out.println("This element is equal to target : "+arr[i]+ " "+arr[j]+ " "+arr[k] );
						set.add(arr[i]+ " "+arr[j]+ " "+arr[k]) ;
					}
				}
			}
		}
		
	}
}
