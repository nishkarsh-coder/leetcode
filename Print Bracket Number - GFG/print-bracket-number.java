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
            String S = read.readLine();
            Solution ob = new Solution();
            ArrayList<Integer> result = ob.barcketNumbers(S);
            for(int value :  result)
            System.out.print(value + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    ArrayList<Integer> barcketNumbers(String S) {
        // code here
        
        Stack<Integer> st=new Stack<>();
        
        ArrayList<Integer> ans=new ArrayList<>();
        int no=1;
        for(int i=0;i<S.length();i++){
        if(S.charAt(i)=='('){
            st.push(no);
            ans.add(no);
            no= st.peek()+1;
        }
        else if(S.charAt(i)==')'){
            ans.add(st.peek());
            st.pop();
        }
        
    }
    return ans;
        
    }
};