//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxSum(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int findMaxSum(int arr[], int n) {
        // code here
        int[] dp=new int[n];
        dp[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            // dp[i]=arr[i];
            int one=dp[i+1];
            int two=arr[i];
            if(i+2<n){
                two+=dp[i+2];
            }
            dp[i]=Math.max(one,two);
            }
        // return helper(arr,0);
        return dp[0];
    }
    
    int helper(int[] arr,int i){
        if(i==arr.length-1){
            return arr[i];
        }
        
        
        int left=helper(arr,i+1);
        int right=0;
        if(i+2<arr.length){
            // int right=0
        right=helper(arr,i+2);
        }
        
        return Math.max(right+arr[i],left);
    }
}