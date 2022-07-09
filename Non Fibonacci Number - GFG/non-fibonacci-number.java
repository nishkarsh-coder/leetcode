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
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.nonFibonacci(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static long nonFibonacci(int N){
        // code here
        long i=4;
        int count=0;
        while(count<N){
            long n1=5*i*i+4;
            long n2=5*i*i-4;
            long s1=(long)Math.sqrt(n1);
            long s2=(long)Math.sqrt(n2);
            if(s1*s1!=n1&&s2*s2!=n2){
                count++;
            }
                i++;
        }
        return i-1;
    }
}