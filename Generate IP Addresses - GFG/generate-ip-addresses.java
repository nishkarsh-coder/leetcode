// { Driver Code Starts
import java.util.*;
class GenIP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            Solution sln = new Solution();
            ArrayList<String> str = sln.genIp(s);
            Collections.sort(str);
            if(str.size() == 0)
                System.out.println(-1);
            else{
                for (String u : str) {
                    System.out.println(u);
                }
            }
        }
    }
}// } Driver Code Ends


/*complete the Function*/

class Solution {
    public ArrayList<String> genIp(String s) {
        // code here
        if(s.length()<4){
            f.add("-1");
            return f;
        }
        
        // ArrayList>String> ans =new ArrayList<>();
        // ans.add(s.charAt(0));
        helper(s,new StringBuilder(),3);
        return f;
    }
    ArrayList<String> f =new ArrayList<>();
    public void helper(String s,StringBuilder ans,int level){
        
        // if(level){
        //     return;
        // }
        if(level==-1&&s.length()==0){
            ans.deleteCharAt(ans.length()-1);
            f.add(ans.toString());
            ans.append(".");
        }
        
        if(level>=0){
        for(int i=1;i<=s.length()-level;i++){
        if(s.substring(0,i).length()>3){
            continue;
        }else if(s.substring(0,i).length()>1&&s.charAt(0)=='0'){
            continue;
        }
        int n=Integer.parseInt(s.substring(0,i));
        // System.out.println(n);
        if(n<256){
        ans.append(s.substring(0,i));
        ans.append(".");
        helper(s.substring(i),ans,level-1);
        int len=s.substring(0,i).length()+1;
        ans.delete(ans.length()-len,ans.length());
        }
         }
        
        }
    }
}