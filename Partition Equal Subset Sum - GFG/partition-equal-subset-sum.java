//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int x = ob.equalPartition(N, arr);
            if(x == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int equalPartition(int n, int arr[])
    {
        // code here
        int total=Arrays.stream(arr).sum();
        if(total%2==1){
            return 0;
        }
        int k=total/2;
       boolean[] prev=new boolean[k+1];
        
        prev[0]=true;
        
        for(int i=n-2;i>=0;i--){
            boolean[] curr=new boolean[k+1];
            for(int j=0;j<=k;j++){
                boolean l=prev[j];
                boolean r=false;
                if(j-arr[i]>=0){
                    r=prev[j-arr[i]];
                }
                
                curr[j]=l||r;
                
            }
            prev=curr;
        }
        
        
        return prev[k]==true?1:0;
    }
}