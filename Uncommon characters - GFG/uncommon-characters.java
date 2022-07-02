// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String A = sc.next();
                    String B = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.UncommonChars(A, B));
                }
        }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    String UncommonChars(String A, String B)
    {
        // code here
        HashMap<Character,Integer> hm=new HashMap<>();
        
        for(int i=0;i<A.length();i++){
            char c=A.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        // System.out.println(hm);
        HashMap<Character,Integer> hm1=new HashMap<>();
        for(int i=0;i<B.length();i++){
            char c=B.charAt(i);
            hm1.put(c,hm1.getOrDefault(c,0)+1);
        }
        // HashMap<Character,Integer> ans=new HashMap<>();
        String ans="";
        for(char key: hm.keySet()){
            if(hm1.containsKey(key)==false){
                ans+=key;
            }
        }
        for(char key: hm1.keySet()){
            if(hm.containsKey(key)==false){
                ans+=key;
            }
        }
        // for(int i=0;i<B.length();i++){
        //     char c=B.charAt(i);
        //   if(hm.containsKey(c)){
        //       if(hm1.containsKey(c)==false){
        //         //   ans.put(c);/
                   
        //       }
        //   }else{
        //       if(hm1.containsKey(c)==true){
        //           ans.put(c);
        //       }
        //   }
        // }
        
       
        if(ans==""){
            return "-1";
        }
        
        // sort(ans1.begin(),ans1.end());
        char [] a= ans.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}