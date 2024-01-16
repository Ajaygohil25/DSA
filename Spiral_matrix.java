package DSA;
// spiral matrix, basically traverse through all array element frame wise

// time complexity T=O(M*N)
// space com. t=o(1)
public class Spiral_matrix 
{
   public static void main(String[] args)
   {
	  int array[][]=
		  {
				  {1,2,3,4},
				  {5,6,7,8},
				  {9,10,11,12},
				  {13,14,15,16}
		  }; 
	 spiral_matrix(array);
   }
   public static void spiral_matrix(int arr[][])
   {
	   int n=arr.length, m=arr[0].length;
	   int count=0;
	   int rmin=0, rmax=arr.length-1;
	   int cmin=0, cmax=arr[0].length-1;
	   
	   while(count<n*m) // because we want to travrse through all elements so M*N
	   {
		   // top boundary
		   for(int c=cmin; c<=cmax && count<n*m; c++)
		   {
			   System.out.print(arr[rmin][c] + " ");
			   count++;
		   }
		   
		   rmin++; 
		   // left boundary  
		   for(int r=rmin; r<=rmax && count<n*m; r++)
		   {
			   System.out.print(arr[r][cmax] + " ");
			   count++;
		   }
		   
		   cmax--; 
		   // bottom boundary
		   for(int c=cmax; c>=cmin && count<n*m; c--)
		   {
			   System.out.print(arr[rmax][c] + " ");
			   count++;
		   }
	
		   rmax--;
		   // right boundary 
		   for(int r=rmax; r>=rmin && count<n*m; r--)
		   {
			   System.out.print(arr[r][cmin]+ " ");
			   count++;
		   }
		  
		   cmin++;
	   }
   }
}
