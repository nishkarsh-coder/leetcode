//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GfG { 
    
	public static void main (String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int m = Integer.parseInt(inputLine[0]);
		    int n = Integer.parseInt(inputLine[1]);
		    Solution ob = new Solution();
		    System.out.println(ob.numberOfPaths(m, n));
		}
	}
}




// } Driver Code Ends


class Solution{
    
    long numberOfPaths(int m, int n) {
        // Code Here
        int[][] dp=new int[m][n];
        // dp[]
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(j==n-1&&i==m-1){
                    dp[i][j]=1;
                }else if(j!=n-1&&i!=m-1){
                    dp[i][j]=dp[i+1][j]+dp[i][j+1];
                }else if(i==m-1){
                    dp[i][j]=dp[i][j+1];
                }else{
                    dp[i][j]=dp[i+1][j];
                }
            }
        }
        return dp[0][0];
    }
    
}