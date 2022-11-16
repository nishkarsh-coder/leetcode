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
		
		sc.nextLine();
		while(t-->0)
		{
		   //taking String X and Y
		   String S[]=sc.nextLine().split(" ");
		   String X=S[0];
		   String Y=S[1];
		   
		   //calling function shortestCommonSupersequence()
		   System.out.println(new Solution().shortestCommonSupersequence(X, Y, X.length(), Y.length()));
		}
	}




       
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find length of shortest common supersequence of two strings.
    public static int shortestCommonSupersequence(String X,String Y,int m,int n)
    {
        //Your code here
        
        int[] prev=new int[n+1];
        
        for(int i=1;i<=m;i++){
            int[] curr=new int[n+1];
            for(int j=1;j<=n;j++){
                if(X.charAt(i-1)==Y.charAt(j-1)){
                    curr[j]=1+prev[j-1];
                }else{
                    curr[j]=Math.max(curr[j-1],prev[j]);
                }
            }
            prev=curr;
        }
        
        return m-prev[n]+n-prev[n]+prev[n];
    }
}