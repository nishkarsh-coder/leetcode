class Solution {
    public String countAndSay(int n) {
        return helper(n).toString();
    }
    
    
    StringBuilder helper(int n){
        if(n==1){
            return new StringBuilder("1");
        }
        
        
        StringBuilder str=helper(n-1);
        
        StringBuilder ans=new StringBuilder();
        int count=1;
        int i=1;
        for(;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }else{
                
                ans.append(count);
                ans.append(str.charAt(i-1));
                count=1;
            }
        }
        ans.append(count);
        ans.append(str.charAt(i-1));
        
        return ans;
    }
}