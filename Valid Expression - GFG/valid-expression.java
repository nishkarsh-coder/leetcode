// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String S = sc.nextLine().trim();
            Solution ob = new Solution();
            if(ob.valid(S))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    boolean valid(String s) 
    { 
        // code here
        
        Stack<Character> st=new Stack<Character>();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                st.push(s.charAt(i));
                //  System.out.println(st.peek());
            }
            else if(s.charAt(i)==')'){
                if(st.size()!=0&&st.peek()=='('){
                    st.pop();
                }
                else{
                    // System.out.println("false1");
                    return false;
                }
            }
            else if(s.charAt(i)=='}'){
                if(st.size()!=0&&st.peek()=='{'){
                    st.pop();
                }
                else{
                    //  System.out.println("false2");
                    return false;
                    
                }
            }
            else if(s.charAt(i)==']'){
                if(st.size()!=0&&st.peek()=='['){
                    st.pop();
                }
                else{
                    //  System.out.println("false3");
                    return false;
                }
            }
        }
        
        if(st.size()==0){
            return true;
        }
        else{
            //  System.out.println("false4");
            return false;
        }
        
    }
} 