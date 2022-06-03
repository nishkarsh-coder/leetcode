// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split("\\s+");
            long S = Long.parseLong(a[0]);
            int N = Integer.parseInt(a[1]);
            long X = Long.parseLong(a[2]);
            String a1[] = in.readLine().trim().split("\\s+");
            long A[] = new long[N];
            for(int i = 0;i < N;i++)
                A[i] = Long.parseLong(a1[i]);
            
            Solution ob = new Solution();
            if(ob.isPossible(S, N, X, A) == 1)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
     static int isPossible(long S, int N, long X, long A[])
    {
        // code here
         long[] ans=new long[N+1]; 
        ans[0]=S;
        long sum1=S;
        for(int i=1;i<N+1;i++){
            ans[i]=sum1+A[i-1];
            if(ans[i]>=X){
                break;
            }
            sum1+=ans[i];
           
        }
        // for(int i=0;i<N+1;i++){
        //     System.out.println(ans[i]);
        // }
        int k=ans.length-1;
        while(k>=0&&X>0){
            if(X>=ans[k]){
                X-=ans[k];
            }
            k--;
        }
        if(X==0){
            return 1;
        }
        return 0;
    }
}