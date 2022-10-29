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


    static Boolean isSubsetSum(int n, int arr[], int k){
        // code here
        boolean[][] dp=new boolean[n+1][k+1];
        // for(bool[]row: dp){
        //     Arrays.fill(row,-1);
        // }
        // return helper(arr,k,0,dp);
        boolean prev[]=new boolean[k+1];
        prev[0]=true;
        // for(int i=0;i<n+1;i++){
        //     prev[]=true;
        // }
        
        for(int i=n-1;i>=0;i--){
            boolean curr[]=new boolean[k+1];
            for(int j=0;j<=k;j++){
                // dp[i][j]=dp[i+1][j];
                // if(j-arr[i]>=0){
                // dp[i][j]=dp[i][j]||dp[i+1][j-arr[i]];
                // }
                
                curr[j]=prev[j];
                if(j-arr[i]>=0)
                curr[j]=prev[j-arr[i]]||curr[j];
                
            }
            prev=curr;
        }
        
        
        return prev[k];
    }
    
    static boolean helper(int[] arr, int k,int ind,int[][] dp){
        if(k==0){
            return true;
        }
        if(k<0){
            return false;
        }
        
        if(ind==arr.length){
            return false;
        }
        if(dp[ind][k]!=-1){
            return dp[ind][k]==1;
        }
        boolean right=helper(arr,k-arr[ind],ind+1,dp);
        boolean left=helper(arr,k,ind+1,dp);
       if(right||left){
        dp[ind][k]=1;
           return true;
       }
        dp[ind][k]=0;
        return false;
    }
}