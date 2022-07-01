// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}// } Driver Code Ends


class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
      public static boolean isAnagram(String a,String b)
    {
        HashMap<Character,Integer> hm=new HashMap<>();
        
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        // Your code here
        
        for(int i=0;i<b.length();i++){
            char c=b.charAt(i);
            if(hm.containsKey(c)){
                // hm.put(c,hm.getOrDefault()-1)
                if(hm.get(c)==0){
                    return false;
                }
                hm.put(c,hm.get(c)-1);
            }else{
                return false;
            }
        }
        
        for(char key:hm.keySet()){
            if(hm.get(key)!=0){
                return false;
            }
        }
        
        return true;
    }
}