//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            
            String S1 = read.readLine().trim();
            String S2 = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestCommonSubstr(S1, S2, n, m));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int longestCommonSubstr(String S1, String S2, int n, int m){
        // code here
       int[][] dp=new int[n+1][m+1];
        
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(S1.charAt(i-1)==S2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=0;
                }
            }
        }
        
        int ans=0;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                // if(){
                   ans=Math.max(dp[i][j],ans); 
                
            }
        }
        
        return ans;
        
    }
    
    // int helper(int i1,int i2,Strings1,String s2){
    //     if(i1==s1.length||i2==s2.length){
    //         return 0;
    //     }
    //     if(dp[i1][i2]!=-1){
    //         return dp[i1][i2];
    //     }
    //     int ans=0;
    //     if(s1.charAt(i1)==s2.charAt(i2)){
    //         ans=1+helper(i1+1,i2+1,s1,s2);
    //     }else{
    //       ans= 
    //     }
        
    //     return ans;
    // }
}