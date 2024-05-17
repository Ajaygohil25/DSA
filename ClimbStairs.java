package dynamicProgramming;

// Here is program to solve climb stairs's possible path for steps  using Dynamic programming 
// Here we have steps of 1,2 and 3 

public class ClimbStairs 
{  
    public static void main(String[] args)
    {
	   int n=10;
	   System.out.println("Possible path : " + findPath(n, new int [n+1]));
	}

	private static int findPath(int n, int dp[]) 
	{
		// base case 
	    if(n==0) {
	    	return 1;
	    }
	    else if (n<0)
	    {
	    	return 0;
	    }
	    if(dp[n] !=0) {
	    	return dp[n];
	    }
	    
	    int f1= findPath(n-1,dp);
	    int f2= findPath(n-2,dp);
	    int f3= findPath(n-3,dp);
	    
	    int ans = f1+f2+f3;
	    dp[n]=ans;
	    return ans;
	    		
	}
}
