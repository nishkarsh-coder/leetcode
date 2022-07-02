// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		String s12 = sc.nextLine();
		for(int i=0; i<t; i++){
		    String s1 = sc.nextLine();
		    String s2 = sc.nextLine();
		    
		    Solution obj = new Solution();
		    
		    boolean flag = obj.isRotated(s1, s2);
		    
		    if(flag == true) System.out.println("1");
		    else System.out.println("0");
		    
		}
	}
}// } Driver Code Ends


class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        // Your code here
        String ans=isRotated1(str1,2);
        if(ans.equals(str2)){
            return true;
        }
        ans=isRotated1(str1,str1.length()-2);
        if(ans.equals(str2)){
            return true;
        }
        return false;
    }
    
    public static String isRotated1(String str1,int k)
    {
        // Your code here
        String ans= str1.substring(k)+str1.substring(0,k);
        // System.out.println(ans);
        return ans;
        
    }
        
        
    
    
}