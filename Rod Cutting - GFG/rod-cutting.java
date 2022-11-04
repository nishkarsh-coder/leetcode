//{ Driver Code Starts
import java.io.*;
import java.util.*;

class RodCutting {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            Solution ob = new Solution();
            System.out.println(ob.cutRod(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution{
    public int cutRod(int price[], int n) {
        //code here
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
       int ans=helper(n,price,n,dp);
       dp[0]=0;
       dp[1]=price[0];
    //   System.out.println(Arrays.toString(dp));
       return ans;
    }
    
    int helper(int i,int[] price,int n,int[] dp){
      if(i==0){
          return 0;
      }
        if(i==1){
            return price[0];
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        
        int notcut=price[i-1];
        int cut=0;
        for(int j=1;j<=i/2+(i%2);j++){
         cut=Math.max(cut,helper(i-j,price,n,dp)+helper(j,price,n,dp));
        }
        dp[i]=Math.max(notcut,cut);
        
        return Math.max(notcut,cut);
        
    }
}