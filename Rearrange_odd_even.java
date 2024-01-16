package DSA;

import java.util.Arrays;

// rearrange array in such way that Rearrange array such that 
//even positioned are greater than odd

// array=[1,3,2,2,5]
public class Rearrange_odd_even 
{

   public static void main(String[] args) 
   {
	  int arr[]= {1,3,2,2,5}; 
	  int n=arr.length;
	
	  
	  rearrange_array(arr, n);
   }
   public static void rearrange_array(int arr[],int n)
   {
	   Arrays.sort(arr); // 1,2,2,3,5
	   int p=0,q=n-1;
	   int temp[]= new int[n];
//	   for(int i=0; i<n; i++)
//	   {
//		   if((i+1)%2==0)
//		   {
//			  // System.out.println("value of i+1 : " + i+1 +" " );
//			
//			   temp[i]= arr[q--];
//		   }
//		   else
//		   {
//			   //System.out.println("value of i :" + i +" ");
//			   temp[i]=arr[p++];
//		   }
//	   }
	   
	   // another approach
	   
	   
	   for(int i: temp)
	   {
		  System.out.println("sorted array : "+i);
	   }
	   
   }
}
