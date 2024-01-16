package DSA;
// rotate matrix by 90 degree. 2D array
// DSA is worth (O_O)
public class Rotate_Matrix_By_90
{
   public static void main(String[] args) 
   {
	  int array[][]= {{1,2,3,4},
					  {5,6,7,8},
					  {9,10,11,12},
					  {13,14,15,16}};
	  System.out.println("Original array \n");
	  printArray(array);
	  rotate_array(array);
	  printArray(array);
	  
   }
   public static void printArray(int [][]arr)
   {
	   for(int[] a: arr)
	   {
		   for(int val:a)
		   {
			   System.out.print(val+ " ");
		   }
		   System.out.println( " ");
		   
	   }
   }
   public static void rotate_array(int array[][])
   {
	   //step-1  this for loop convert array according to raw wise 
	   for(int i=0; i<array.length; i++)   // traverse by column 
	   {
		   for(int j=i+1; j<array[0].length; j++) // traverse by raw
		   {
			   int temp= array[j][i];
			   array[j][i]=array[i][j];
			   array[i][j]=temp;
		   }
	   }
	   // printing raw wise matrix 
	   System.out.println("Step-1 :  ");
	   printArray(array);
	   
	   // step-2 : swap position of element 
	  for(int i=0; i<array.length; i++)
	  {
		  int left=0, right=3;
		  while(left< right)
		  {
			  int temp= array[i][left];
			  array[i][left]=array[i][right];
			  array[i][right]=temp;
			  left++;
			  right--;
		  }
	  }
	  System.out.println("\n step-2 \n");
	   
	   
   }
}
