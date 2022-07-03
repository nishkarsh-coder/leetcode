// { Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine().trim();
            Solution ob = new Solution();
            ArrayList<String> ans = new ArrayList<String>();
            ans = ob.permutation(S);
            
            for(int i=0;i<ans.size();i++){
                System.out.print("("+ans.get(i)+")");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution{
    
    ArrayList<String> permutation(String S){
        // Code Here
        ArrayList<String> ans= new ArrayList<String>();
        if(S.length()==1){
            ans.add(S);         
            return ans;
        }
        
         ArrayList<String> ans1= permutation(S.substring(1));
        //  if(ans1.length()==1){
        //      ans.add(S.charAt(0));
        //  }
         for(String s: ans1){
             ans.add(S.charAt(0)+" "+s); 
         }
          for(String s: ans1){
            //  ans.add(S.charAt(0)+s);
             ans.add(S.charAt(0)+s);
            
             
         }
         return ans;
        
    }
    
}