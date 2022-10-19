//{ Driver Code Starts
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
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{


    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        int[][] dp=new int[N][sum]; 
        for(int i[]: dp){
            Arrays.fill(i,-1);
        }
        return helper(0, arr, sum,0,dp);
    }
    
    static boolean helper(int i,int[] arr,int sum,int curr_sum,int[][] dp){
    if(sum==curr_sum){
    return true;    
    }
    if(sum<curr_sum){
        return false;
    }
    if(i==arr.length){
        return false;
    }
    
    if(dp[i][curr_sum]!=-1){
        return false;
    }
    
    if(helper(i+1,arr,sum,curr_sum+arr[i],dp)){
        dp[i][curr_sum]=1;
        return true;
    }
    if(helper(i+1,arr,sum,curr_sum,dp)){
        dp[i][curr_sum]=1;
        return true;
    }
    dp[i][curr_sum]=0;
    return false;
    }
}