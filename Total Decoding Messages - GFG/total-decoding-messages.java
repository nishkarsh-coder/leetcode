//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.CountWays(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int CountWays(String str)
    {
        // code here
        if(str.charAt(0)=='0'){
            return 0;
        }
        int n=str.length();
        int num=1000000007;
        int[] dp=new int[n+1];
        dp[n]=1;
        // dp[n-1]=1;
        for(int i=n-1;i>=0;i--){
            dp[i]=dp[i+1]%num;
            if(str.charAt(i)=='0'){
                dp[i]=0;
            }else if(i+2<n+1&&str.charAt(i)=='1'){
                dp[i]=(dp[i]%num+dp[i+2]%num)%num;
            }else if(i+2<n+1&&str.charAt(i)=='2'&&str.charAt(i+1)<'7'){
                // System.out.println(i);
                dp[i]=(dp[i]+dp[i+2])%num;
            }
        }
        // System.out.println(Arrays.toString(dp));
        return dp[0];
        
    }
}