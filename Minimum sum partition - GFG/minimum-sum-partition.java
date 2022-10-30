//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int A[] = new int[n];
                    for(int i = 0;i<n;i++)
                        A[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDifference(A,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{

	public int minDifference(int nums[], int n) 
	{ 
	    // Your code goes here
	     int total=Arrays.stream(nums).sum();
        boolean[] prev=new boolean[total+1];
        // int n=nums.length;
        prev[0]=true;
        for(int i=n-1;i>=0;i--){
           boolean[] curr=new boolean[total+1];
            for(int j=0;j<=total;j++){
            curr[j]=prev[j];
                if(j-nums[i]>=0){
                    curr[j]=curr[j]||prev[j-nums[i]];
                }
            }
            prev=curr;
        }
        
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<=total/2;i++){
            if(prev[i]){
                ans=Math.min(ans,total-i-i);
            }
        }
        return ans;
	} 
}
