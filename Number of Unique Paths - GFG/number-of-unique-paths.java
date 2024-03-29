//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int t=sc.nextInt();
		while(t-->0)
		{
		    //taking dimensions of the matrix
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    Solution ob = new Solution();
		    //calling method NumberOfPath()
		    System.out.println(ob.NumberOfPath(a,b));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find total number of unique paths.
    public static int NumberOfPath(int a, int b) 
    {
        //Your code here
        int[][] dp=new int[a][b];
        dp[a-1][b-1]=1;
        for(int i=a-1;i>=0;i--){
            for(int j=b-1;j>=0;j-- ){
                if(i==a-1&&j==b-1){
                    
                }
                else if(i!=a-1&&j!=b-1){
                    dp[i][j]=dp[i+1][j]+dp[i][j+1];
                }else if(i==a-1){
                    dp[i][j]=dp[i][j+1];
                }else{
                    dp[i][j]=dp[i+1][j];
                }
            }
        }
        return dp[0][0];
    }
}