//{ Driver Code Starts
import java.util.*;
import java.io.*;

class GFG
 {
	public static void main (String[] args)
	 {
	  
	  //taking input using Scanner class
	  Scanner sc = new Scanner(System.in);
	  
	  //taking count of testcases
	  int t = sc.nextInt();
	  while(t-- > 0){
	      
	      //taking count of houses
	      int n = sc.nextInt();
	      int arr[] = new int[n];
	      
	      //inserting money present in 
	      //each house in the array
	      for(int i = 0; i<n; ++i)
	           arr[i] = sc.nextInt();
  	      
  	      //calling method FindMaxSum() of class solve
  	      System.out.println(new Solution().FindMaxSum(arr, n));
	 }
   }
}
// } Driver Code Ends


class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        
        int[] dp=new int[n];
        int prev=arr[0];
        if(n==1){
            return prev;
        }
        int prev2=Math.max(arr[1],prev);;
        
        if(n==2){
            return prev2;
        }
        for(int i=2;i<n;i++){
            int curr=Math.max(prev+arr[i],prev2);
            prev=prev2;
            prev2=curr;
        }
        return prev2;
        // int n=arr.length;
        // int[] dp=new int[n];
        // dp[0]=arr[0];
        // dp[1]=arr[1];
        // for(int i=2;i<n;i++){
        //     // dp[i]=arr[i];
        //     int one=dp[i-1];
        //     int two=arr[i]+dp[i-2];
           
        //     dp[i]=Math.max(one,two);
        //     }
        // // return helper(arr,0);
        
//         int dp[] = new int[n + 1];

// 		/*
// 		[9583, 8878, 13292, 15327, 19833, 21721, 21721, 24847, 26798, 26798]
// 26798
// 			dp[i]: The max money looted after the first i houses.

// 			dp[i+1] = max(dp[i], houses[i] + dp[i-1]), if i > 0
// 			dp[i+1]	= max(dp[i], houses[i]),           if i = 0.
// 		*/

// 		for(int i = 0; i < n; i++) {

// 			if(i > 0) {
// 				dp[i+1] = Math.max(dp[i], houses[i] + dp[i-1]);
// 			} else {
// 				dp[i+1] = Math.max(dp[i], houses[i]);
// 			}
// 		}
//         System.out.println(Arrays.toString(dp));

//         return dp[n];
    }
}