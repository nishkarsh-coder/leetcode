class Solution {
    public int numDecodings(String s){
       Integer[] dp=new Integer[s.length()];
        return helper(0,s,dp); 
    }
    
    
   int helper(int i,String str,Integer[] dp){
       
       if(str.length()==i){
          return 1; 
       }
       if(dp[i]!=null){
           return dp[i];
       }
       if(str.charAt(i)=='0'){
            return 0;
        }

        
       int a=helper(i+1,str,dp);
       int b=0;
       if(str.charAt(i)<'3'&&i+1<str.length()){
           if(str.charAt(i)=='2'&&str.charAt(i+1)>'6'){
              return a; 
           }
        b=helper(i+2,str,dp);           
       }
          dp[i]=a+b;
       return a+b;
    }
}