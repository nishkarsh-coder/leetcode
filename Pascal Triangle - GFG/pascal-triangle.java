// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            ArrayList<Long> ans = new Solution().nthRowOfPascalTriangle(n);
            printAns(ans);
        }
    }
    public static void printAns(ArrayList<Long> ans) {
        for (Long x : ans) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        // code here
          ArrayList<ArrayList<Long>> list1=new ArrayList<ArrayList<Long>>(); 
         if(n==0){
             return new ArrayList<Long>();
         }
         for(int i=0;i<n;i++){
         ArrayList<Long> ans =new ArrayList<Long>();
             for(int j=0;j<=i;j++){
                 if(j==0||j==i){
                     ans.add((long)1);
                 }
                 else{
                    ArrayList<Long> row=list1.get(i-1);
                    ans.add((row.get(j)+row.get(j-1))%1000000007);
                 }
             }
             list1.add(ans);
         }
         return list1.get(n-1);
    }
}