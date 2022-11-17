class Solution {
    public boolean isMatch(String s, String p) {
//         if(s.length()==0){
            
//             for(int i=0;i<p.length();i++){
//                 if(p.charAt(i)!='*'){
//                     return false;
//                 }
//             }
//             return true;
//         }
        int[][] dp=new int[s.length()+1][p.length()+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return helper(0,0,s,p,dp);
    }
    
    boolean helper(int i,int j,String s,String p,int[][] dp){
        // System.out.println(i+" "+j);
        if(j==p.length()&&i==s.length()){
            return true;
        }
        if(j==p.length()){
            return false;
        }
        if(s.length()<i){
            return false;
        }
        if(dp[i][j]!=-1){
            return false;
        }
        boolean ans=false;
           
      if(p.charAt(j)=='*'){
            if(helper(i,j+1,s,p,dp)){
                return true;
            }
            if(helper(i+1,j,s,p,dp)){
                return true;
            }
        }else if(p.charAt(j)=='?'){
            if(helper(i+1,j+1,s,p,dp)){
                return true;
            }
        }else if(i!=s.length()&&p.charAt(j)==s.charAt(i)){
        if(helper(i+1,j+1,s,p,dp)){
            return true;
        }
      } 
        dp[i][j]=1;
        return ans;
    }
}