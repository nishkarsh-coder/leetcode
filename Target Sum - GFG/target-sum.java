//{ Driver Code Starts
//Initial Template for JAVA

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            
            int[] A = new int[N];
            
            for(int i=0 ; i<N ; i++){
                A[i] = Integer.parseInt(S[i]);
            }
            int target = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.findTargetSumWays(A,N, target));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int findTargetSumWays(int[] A , int N, int target) {
        // code here
        ans=0;
        helper( A,0,target,0);
        return ans;
    }
    static int ans;
    static void helper(int[] A,int i,int target,int sum){
        if(i==A.length){
            if(target==sum){
              ans++;  
            }
            return;
        }
        helper(A,i+1,target,sum-A[i]);
        helper(A,i+1,target,sum+A[i]);
    }
    
};