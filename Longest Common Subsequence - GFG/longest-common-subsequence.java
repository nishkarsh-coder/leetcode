//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {

		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-- > 0){
		    int p=sc.nextInt();             // Take size of both the strings as input
		    int q=sc.nextInt();
		    
		    String s1=sc.next();            // Take both the string as input
	        String s2=sc.next();
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.lcs(p, q, s1, s2));
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x, int y, String s1, String s2)
    {
        // your code here
        int[][]dp=new int[x][y];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        // return helper(x-1,y-1,s1,s2,dp);
        // int[][] dp
        // int[][] dp=new int[][]
        int[] prev=new int[y];
        for(int i=0;i<x;i++){
            int[] curr=new int[y];
            for(int j=0;j<y;j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    if(j-1>=0)curr[j]=1+prev[j-1];
                    else curr[j]=1;
                }else if(j-1>=0){
                    curr[j]=Math.max(prev[j],curr[j-1]);
                }else{
                    curr[j]=prev[j];
                }
            }
            prev=curr;
        }
        

        return prev[y-1];
        
    }
    
    static int helper(int i1,int i2,String s1,String s2,int[][] dp){
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