// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.stream.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            String arr[] = in.readLine().trim().split("\\s+");
            List<String> dict = new ArrayList<String>();
            for(int i = 0;i < n;i++)
                dict.add(arr[i]);
            String s = in.readLine();
            
            Solution ob = new Solution();
            List<String> ans = new ArrayList<String>();
            ans = ob.wordBreak(n, dict, s);
            if(ans.size() == 0)
                System.out.println("Empty");
            else{
                List<String> sol = ans.stream().sorted().collect(Collectors.toList());
                for(int i = 0;i < sol.size();i++)
                    System.out.print("("+sol.get(i)+")");
                System.out.println();
            }
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
     static List<String> wordBreak(int n, List<String> dict, String s)
    {
        // code here
         List<String> a=new ArrayList<>();
        helper(n,dict,s,a,"");
        return a;
        
    }
    // static boolean found=false;
    public static void helper(int n, List<String> dict, String s,List<String> a,String str){
        if(s.length()==0){
            // List<String> arr=new ArrayList<String>();
            a.add(str.trim());
            return;
        }
        // StringBuilder ans=new StringBuilder();
        String ans="";
      
        // List<String> a=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            // ans.append(c);
            ans+=c;
            if(dict.contains(ans)){
                // found=false;
               helper(n,dict,s.substring(i+1),a,str+ans+" ");
                // for(String str:ans1){
                //     // a.add(str);
                //     a.add(ans+" "+str);
                // }
                // if(ans1.size()==0){
                //     a.add(ans);
                // }
            }
        }
        // if(found){
        //     List<String> arr=new ArrayList<String>();
        //     return arr;
        //     // return ;
        // }
        // return a;
    }
}