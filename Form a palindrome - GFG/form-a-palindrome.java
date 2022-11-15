//{ Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String str = read.readLine();

            Solution ob = new Solution();
            
            System.out.println(ob.countMin(str));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int countMin(String str)
    {
        // code here
        StringBuilder s=new StringBuilder(str);
        int[] prev=new int[str.length()+1];
        String rev=s.reverse().toString();
        for(int i=1;i<=str.length();i++){
            int[]curr=new int[str.length()+1];
            for(int j=1;j<=str.length();j++){
                if(str.charAt(i-1)==rev.charAt(j-1)){
                curr[j]=1+prev[j-1];
                }else{
                    curr[j]=Math.max(curr[j-1],prev[j]);
                }
            }
            prev=curr;
        }
        
        return str.length()-prev[str.length()];
        
        
    }
    

}