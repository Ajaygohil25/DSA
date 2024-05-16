package dynamicProgramming;

public class FibonacciTopDown 
{
	public static void main(String[] args) 
	   {
		   int n=10;
		   System.out.println("Fibonacci number of N is  :  "+ fibTopDown(n, new int[n+1]));
	   }

		private static int fibTopDown(int n, int[] dp) // here dp is storage for element
		{
			// base case condition
			if(n==0 || n==1)
			{
				return n;
			}
			
			if(dp[n] !=0)
			{
				return dp[n];
			}
			int fb= fibTopDown(n-1, dp) + fibTopDown(n-2, dp);
			dp[n]=fb; // store the value of recurvise call in storage 
			return fb;
		}
}
