// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
                        
        }
	}
}

// } Driver Code Ends


class Solution{
    public List<String> find_permutation(String S) {
        HashSet<String> s=new HashSet<>();
        List<String> l=permutation(S);
        for(int i=0;i<l.size();i++){
        s.add(l.get(i));
        }
        l=new ArrayList<>();
        for(String str: s){
            l.add(str);
        }
        Collections.sort(l);
        return l;
    }
   public List<String> permutation(String S) {
    if(S.length()==0){
             List<String> list=new ArrayList<String>();
             list.add("");
             return list;
        }
         List<String>ans=new ArrayList<String>();
        
        for(int i=0;i<S.length();i++){
        char c= S.charAt(i);
        String str= S.substring(0,i)+S.substring(i+1);
        List<String> list= permutation(str);
        
        for(String val: list){
            ans.add(c+val);
        }
        }
        
        return ans;   
   }
    
}