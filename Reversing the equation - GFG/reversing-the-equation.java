// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.reverseEqn(s));    
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution
{
   
    String reverseEqn(String S)
    {
        // your code here
        
        Stack<String> st =new Stack<>();
        String a="";
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)>='0'){
              a+=S.charAt(i);  
            }
            else{
                st.push(a);
                a="";
                a+=S.charAt(i);
                st.push(a);
                a="";
            }
        }
        
         if(a!=""){
              st.push(a);  
            }
            String ans="";
            while(st.size()!=0){
                ans+=st.peek();
                st.pop();
            }
            return ans;
    }
}