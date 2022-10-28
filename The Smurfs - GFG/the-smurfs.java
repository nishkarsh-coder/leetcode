//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            
            Solution ob = new Solution();
            System.out.println(ob.minFind(n, a));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int minFind(int n, String a[]){
        // code here
        // Stack<Character> st=new Stack<>();
        int red=0;
        int green=0;
        int blue=0;
        // st.push(a[0].charAt(0));
        for(int i=0;i<n;i++){
            char top=a[i].charAt(0);
                if(top=='B'){
                    blue++;
                }else if(top=='G'){
                    green++;
                }else{
                    red++;
                }
            }
        
        // System.out.println(st);
        if((red==n)||(blue==n)||(green==n)){
            return n;
        }else if(red%2==1&&blue%2==1&&green%2==1){
            return 2;
        }else if(red%2==0&&blue%2==0&&green%2==0) {
            return 2;
        }else{
            return 1;
        }
        // return st.size();

        
    }
}