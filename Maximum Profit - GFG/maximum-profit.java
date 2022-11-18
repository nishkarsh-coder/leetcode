//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int K = Integer.parseInt(in.readLine());
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int A[] = new int[N];
            for (int i = 0; i < N; i++) A[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            System.out.println(ob.maxProfit(K, N, A));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int maxProfit(int k, int N, int A[]) {
        // code here
        
        int[][][] dp=new int[N][2][k+1];
        for(int[][] row:dp){
            for(int[] col:row){
                
            Arrays.fill(col,-1);
            }
        }
        return helper(0,true,k,A,dp);
        
    }
static int helper(int i,boolean buy,int k,int[] cost,int[][][] dp){
        if(i==cost.length){
            return 0;
        }
        if(k==0){
            return 0;
        }
        int b=0;
        if(buy){
            b=1;
        }
        if(dp[i][b][k]!=-1){
            return dp[i][b][k];
        }
        int ans=0;
        if(buy){
            int val1=helper(i+1,false,k,cost,dp)-cost[i];
            int val2=helper(i+1,buy,k,cost,dp);
            if(val1>val2){
                    // ans1.add(0,new ArrayList<>());
                    // ans1.get(0).add(0,i); 
                ans=val1;
                
            }else{
                ans=val2;
            }
        }else{
            
            int val1=helper(i+1,true,k-1,cost,dp)+cost[i];
            int val2=helper(i+1,buy,k,cost,dp);
            if(val1>val2){
                // ans1.add(0,new ArrayList<>());
                // ans1.get(0).add(0,i); 
                ans=val1;
                
            }else{
                ans=val2;
            }
        }
        
        dp[i][b][k]=ans;
        return ans;
    }
}