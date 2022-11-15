//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s1 = sc.next();
                    String s2 = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.minOperations(s1,s2));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
	public int minOperations(String str, String rev) 
	{ 
	    // Your code goes here  StringBuilder s=new StringBuilder(str);
        int[] prev=new int[rev.length()+1];
        // String rev=s.reverse().toString();
        for(int i=1;i<=str.length();i++){
            int[]curr=new int[rev.length()+1];
            for(int j=1;j<=rev.length();j++){
                if(str.charAt(i-1)==rev.charAt(j-1)){
                curr[j]=1+prev[j-1];
                }else{
                    curr[j]=Math.max(curr[j-1],prev[j]);
                }
            }
            prev=curr;
        }
        
        return str.length()-prev[rev.length()]+rev.length()-prev[rev.length()];
	} 
}