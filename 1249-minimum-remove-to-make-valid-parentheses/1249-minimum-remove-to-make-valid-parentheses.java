class Solution {
    
    class pair{
        char c;
        int ind;
        pair(char c,int ind){
            this.c=c;
            this.ind=ind;
        }
    }
     
    public String minRemoveToMakeValid(String s) {
        Stack<pair> st=new Stack<>();
        
        // for(int i=0;i<s.length();i++){
        //      char c=s.charAt(i);
        //     if(c=='('){
        //         st.add(new pair('(',i));
        //     }else if(st.size()!=0&&st.peek().==')'){
        //         st.add();
        //     }
        // }
        
        
        StringBuilder ans=new StringBuilder();
        StringBuilder letter=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                ans.append(letter);
                st.add(new pair('(',ans.length()));
                letter=new StringBuilder();
            }else if(st.size()!=0&&st.peek().c=='('&&c==')'){
                ans.insert(st.peek().ind,"(");
                st.pop();
                ans.append(letter);
                ans.append(c);
                letter=new StringBuilder();
            }
            else if(c==')'){
                continue;
            }else{
                letter.append(c);
            }
        }
        ans.append(letter);
        return ans.toString();
    }
}