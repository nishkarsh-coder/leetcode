//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String line1[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(line1[0]);
            int W = Integer.parseInt(line1[1]);
            String line2[] = in.readLine().trim().split("\\s+");
            int val[] = new int[N];
            for(int i = 0;i < N;i++)
                val[i] = Integer.parseInt(line2[i]);
            String line3[] = in.readLine().trim().split("\\s+");
            int wt[] = new int[N];
            for(int i = 0;i < N;i++)
                wt[i] = Integer.parseInt(line3[i]);
                
            Solution ob = new Solution();
            System.out.println(ob.knapSack(N, W, val, wt));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int knapSack(int N, int W, int val[], int wt[])
    {
        // code hereint
        int[][] dp=new int[N][W+1];
        for(int i=0;i<N;i++){
            for(int j=0;j<W+1;j++){
                dp[i][j]=-1;
            }
        }
        
        return helper(0,W,val,wt,dp);
        
        
    }
    
    static int helper(int ind,int maxweight,int[] val,int[]wt,int[][] dp){
        if(maxweight==0){
            return 0;
        }
        
        if(ind==wt.length){
            return 0; 
        }
        if(dp[ind][maxweight]!=-1){
            return dp[ind][maxweight];
        }
        
        
        int a=helper(ind+1,maxweight,val,wt,dp);
        int b=0;
        if(maxweight>=wt[ind]){
            b=val[ind]+helper(ind,maxweight-wt[ind],val,wt,dp);
        }
        dp[ind][maxweight]=Math.max(a,b);
        return Math.max(a,b);
        
        
    }
}