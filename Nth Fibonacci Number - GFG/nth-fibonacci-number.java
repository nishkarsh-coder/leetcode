// { Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution {
    static long nthFibonacci(long n){
        // code here
        long[] dp=new long[(int)(n)+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<n+1;i++){
            dp[i]=(dp[i-1]+dp[i-2])%(long)1000000007;
        }
        // System.out.println(701408733+433494437);
        return dp[(int)n]%(long)1000000007;
    }
    
    
    // static void helper(int n,){
    //     if(n==0){
    //     dp[0]=0;
    //     return;
            
    //     }else if(n==1){
    //     dp[1]=1;
    //     return;
    //     }
    // }
}