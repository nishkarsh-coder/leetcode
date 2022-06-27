// { Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     Solution obj = new Solution();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 }
	 }
}// } Driver Code Ends




class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        // Your code here
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<line.length();i++){
            char c =line.charAt(i);
            if(hm.containsKey(c)){
                int a=hm.get(c);
                hm.put(c,a+1);
            }
            else{
                hm.put(c,1);
            }
        }
        char mxc=line.charAt(0);
        for(char v :hm.keySet()){
            if(hm.get(v)==hm.get(mxc)){
                int x=v-'0';
                int y= mxc-'0';
                if(x<y){
                    mxc=v;
                }
            }
            else if(hm.get(v)>hm.get(mxc)){
            // System.out.println(v+" "+hm.get(v));
                mxc=v;
            }
        }
        return mxc;
    }
    
}