//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());
            
            int val[] = new int[n];
            int wt[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            //inserting the values
            for(int i = 0; i < n; i++)
              val[i] = Integer.parseInt(st[i]);
             
            String s[] = read.readLine().trim().split("\\s+"); 
            
            //inserting the weigths
            for(int i = 0; i < n; i++)
              wt[i] = Integer.parseInt(s[i]);
              
            //calling method knapSack() of class Knapsack
            System.out.println(new Solution().knapSack(w, wt, val, n));
        }
    }
}




// } Driver Code Ends


class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 
         int[][] dp=new int[n][W+1];
        for(int[] row:dp){
        Arrays.fill(row,-1);
        }
        ans=0;
    
    
          ans= helper(wt,val,0,W,dp);
        //   for(int[] row:dp){
        // // Arrays.fill(row,-1);
        //   System.out.println(Arrays.toString(row)+"//");
        // }
         return ans; 
    } 
    static int ans;
    static int helper(int[] wt ,int[] val,int ind,int W,int dp[][]){
        // System.out.println(ind+" "+value+" "+W);
        if(W<0)
        {
            return 0;
        }
        if(ind==wt.length){
            // System.out.println(value);
            // ans=Math.max(ans,value);
            // System.out.println(ans);
            return 0;
        }
         if(dp[ind][W]!=-1){
            return dp[ind][W];
        }
        
        int a=0;
        if(W-wt[ind]>=0){
        a=val[ind]+helper(wt,val,ind+1,W-wt[ind],dp);
        }
        int b=helper(wt,val,ind+1,W,dp);
        dp[ind][W]=Math.max(a,b);
        
        return Math.max(a,b); 
    }
}


