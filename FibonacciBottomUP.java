package dynamicProgramming;
//  This program calculate  fibonacci series using Dynamic Progamming approach

// in top down approach we are using storage (array) for store the value of previous recurtion
// however, in bottom up apprach we are calculate fibonacci using dp[n] = dp[n-1] + dp[n-2] logic,
// which is basic logic for solve fibbonaci numbers
public class FibonacciBottomUP 
{
   public static void main(String[] args) 
   {
	   int n=10;
	   System.out.println("Fibonacci number is N : "+FibonacciBottomUP(n));
   }

		private static int FibonacciBottomUP(int n) {
			int dp[]= new int[n+1];
			dp[0]=0;
			dp[1]=1;
			// use of iterative approach for calculate sum
			for(int i=2; i<dp.length; i++)
			{
				dp[i] = dp[i-1]+dp[i-2];
			}
			return dp[n];
		}  
}
