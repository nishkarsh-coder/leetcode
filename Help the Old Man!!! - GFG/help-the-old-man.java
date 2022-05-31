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
            int N = Integer.parseInt(a[0]);
            int n = Integer.parseInt(a[1]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.shiftPile(N, n);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static void shift(int n,int s,int d,int h,int[] count,List<Integer>ans,int k){
        // if(n==1){
        //   ArrayList<Integer> ans1=new ArrayList<Integer>();
        //   ans1.add(s);
        //   ans1.add(d);
        //   ans.add(ans1);
        //   return;
        // }
        if(n==0){
            return;
        }
        
        shift(n-1,s,h,d,count,ans,k);
        count[0]++;
        // List<Integer> ans1=new ArrayList<Integer>();
        //   ans1.add(s);
        //   ans1.add(d);
        //   ans.add(ans1);
        if(count[0]==k){
            ans.add(s);
            ans.add(d);
        }
         shift(n-1,h,d,s,count,ans,k);
        return;
        
    }
    static List<Integer> shiftPile(int N, int n){
        // code here
        int[] count=new int[1];
        // List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> ans=new ArrayList<Integer>();
        shift(N,1,3,2,count,ans,n);
        // List<Integer>list=ans.get(n-1);
        return ans;
        
    }
}