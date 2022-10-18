//{ Driver Code Starts

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            Long N = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.canJump(N));
        }
    }
}
// } Driver Code Ends



class Solution {
    static String canJump(Long N) {
        // code here
        return check(N)==false?"False":"True";
    }
    static boolean check(Long n){
        return (int)Math.ceil(Math.log(n)/Math.log(2))==(int) Math.floor(Math.log(n)/Math.log(2));
    }
};