// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            
            Solution ob = new Solution();
            String result = ob.removeDups(s);
            
            System.out.println(result);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    String removeDups(String S) {
        // code here
        HashMap<Character,Integer> hm=new HashMap<>();
        
        for(int i=0;i<S.length();i++){
            hm.put(S.charAt(i),0);
        }
        String ans="";
        for(int i=0;i<S.length();i++){
            if(hm.containsKey(S.charAt(i))){
                ans+=S.charAt(i);
                hm.remove(S.charAt(i));
                
            }
        }
        return ans;
    }
}