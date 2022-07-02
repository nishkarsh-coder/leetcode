// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;


 // } Driver Code Ends
//User function template for JAVA

class Solution
{
    //Function to find the minimum indexed character.
      public static int minIndexChar(String A, String B)
    {
        // Your code here
        HashMap<Character,Integer>hm =new HashMap<>();
        
        for(int i=0;i<A.length();i++){
            if(hm.containsKey(A.charAt(i))==false){
            hm.put(A.charAt(i),i);
            }
        }
        int ans=A.length();
        // System.out.println(hm);
        for(int i=0;i<B.length();i++){
            // System.out.println(hm.get(B.charAt(i))+" "+ans);
            if(hm.get(B.charAt(i))!=null&&hm.get(B.charAt(i))<ans){
               int a=hm.get(B.charAt(i));
                ans=a;
            }
        }
        if(ans==A.length()){
            return -1;
        }
        
        return ans;
    }
}

// { Driver Code Starts.

class GFG {
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		    t--;
		    
		    String s1=sc.next();
		    String s2=sc.next();
		    
		    int res = new Solution().minIndexChar(s1, s2);
		    System.out.println(res);
		}
	}
}
  // } Driver Code Ends