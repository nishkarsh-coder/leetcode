// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}
// } Driver Code Ends




class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        ArrayList<String> arr=new ArrayList<>();
        String ans="";
        for(int i=0;i<S.length();i++){
        char c =S.charAt(i);
            if(S.charAt(i)=='.'){
            
            arr.add(ans);
            ans="";
            }else{
            ans+=c;
            }
        }
        arr.add(ans);
        ans="";
        for(int i=arr.size()-1;i>=0;i--){
            ans+=arr.get(i);
            if(i!=0){
            ans+=".";
            }
            
        }
        return ans;
    }
}