//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int v = sc.nextInt();
                    int m = sc.nextInt();
                    int coins[] = new int[m];
                    for(int i = 0;i<m;i++)
                        coins[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minCoins(coins, m, v));
                }
        }
}    
// } Driver Code Ends


class Solution{

	public int minCoins(int coins[], int M, int V) 
	{ 
	    // Your code goes here
	   // M-/;
	   int[][] dp=new int[M][V+1];
	   for(int[] row:dp){
	       Arrays.fill(row,-1);
	   }
	   Arrays.sort(coins);
	  int ans= helper(V,coins,0,dp);
	  if(ans==Integer.MAX_VALUE){
	      return -1;
	  }
	   return ans;
	} 
	
	int helper(int money,int[] coins,int i,int[][]dp){
	    
	    if(money==0){
	        return 0;
	    }
	    
	    if(i==coins.length){
	        return Integer.MAX_VALUE;
	    }
	    if(dp[i][money]!=-1){
	        return dp[i][money];
	    }
	    int not=helper(money,coins,i+1,dp);
	    int pick=Integer.MAX_VALUE;
	    if(money>=coins[i]){
	    pick=helper(money-coins[i],coins,i,dp) ;    
	   // money=money%coins[i];  
	   if(pick!=Integer.MAX_VALUE){
	    pick=1+pick;
	   }
	    }
	  
	    dp[i][money]=Math.min(pick,not);
	    return dp[i][money];
	}
}