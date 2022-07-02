// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String S = read.readLine();
            Solution obj = new Solution();
            System.out.println(obj.printSequence(S));
            
        }
    } 
} // } Driver Code Ends


//User function Template for Java
class Solution 
{    
    String printSequence(String S) 
    { 
        // code here
        String[] list={" ","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        HashMap<Character,String> hm =new HashMap<>();
        for(int i=0;i<list.length;i++){
            String s=list[i];
            char[] carr=s.toCharArray();
           int j=0;
            for(char c :carr){
            String ans=i+1+"";
            int t=j;
            // System.out.println("t"+t+"j"+j);
            String temp=ans;
            while(j>0){
                ans+=temp;
                // System.out.println(temp);
                j--;
            }
            // System.out.println("t"+t+"j"+j+"Df");
            hm.put(c,ans);
            j=t+1;
            }
        }
        hm.put(' ',"0");
        String ans="";
        // System.out.println(hm);
        for(int i=0;i<S.length();i++){
            char c=S.charAt(i);
            ans+=hm.get(c);
        }
    return ans;
    }
}