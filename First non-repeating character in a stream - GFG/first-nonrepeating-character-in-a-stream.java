// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
        // Queue<Character> q =new Queue<>();/
        ArrayList<Character> arr=new ArrayList<>();
        arr.add(0,'#');
        HashSet<Character> h=new HashSet<>();
        String ans="";
        for(int i=0;i<A.length();i++){
            char c =A.charAt(i);
            if(h.contains(c)==false){
            // q.add(c);
            // ans+=c;
              arr.add(1,c);  
            }else{
                arr.remove(Character.valueOf(c));
            }
            ans+=arr.get(arr.size()-1);
            h.add(c);
        }
        return ans;
    }
}