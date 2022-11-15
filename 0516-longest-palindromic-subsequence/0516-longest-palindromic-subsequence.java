class Solution {
    public int longestPalindromeSubseq(String s) {
        
        int[] prev=new int[s.length()+1];
        StringBuilder str=new StringBuilder(s);
        String rev= str.reverse().toString();
        
        for(int i=1;i<=s.length();i++){
        int[] curr=new int[s.length()+1];
        for(int j=1;j<=rev.length();j++){
            if(s.charAt(i-1)==rev.charAt(j-1)){
                curr[j]=1+prev[j-1];
            }else
            {
                curr[j]=Math.max(prev[j],curr[j-1]);
            }
        }
            prev=curr;
        }
       return prev[s.length()]; 
    }
    
//     int helper(){
        
//     }
    
}