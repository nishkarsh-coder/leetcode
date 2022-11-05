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
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.longestPalinSubseq(s));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int longestPalinSubseq(String S)
    {
        //code here
        int[][] dp=new int[S.length()][S.length()];
        for(int[] rows:dp){
            Arrays.fill(rows,-1);
        }
        StringBuilder str=new StringBuilder(S);
        return helper(S.length()-1,S.length()-1,S,str.reverse().toString(),dp);
    }
    
    int helper(int i1,int i2,String s1,String s2,int[][]dp){
        // System.out.println(s1+" "+s2);
        if(i1<0||i2<0){
            return 0;
        }
        if(dp[i1][i2]!=-1){
            return dp[i1][i2];
        }
        int ans=0;
        if(s1.charAt(i1)==s2.charAt(i2)){
            ans=1+helper(i1-1,i2-1,s1,s2,dp);
        }else{
            ans=Math.max(helper(i1-1,i2,s1,s2,dp),helper(i1,i2-1,s1,s2,dp));
        }
        dp[i1][i2]=ans;
        return ans;
    }
}