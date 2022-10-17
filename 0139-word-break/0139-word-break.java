class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> h=new HashSet<>();
        for(String str:wordDict){
            h.add(str);
        }
        int[][] dp=new int[s.length()][s.length()];
        for (int[] row: dp)
    Arrays.fill(row, -1);
        return helper(s,0,0,h,dp);
//         int n=s.length();
//         boolean[] dp=new boolean[n+1];
//         dp[n]=true;
//         int e=n;
//         for(int i=n-1;i>=0;i--){
//             // System.out.println(i+" "+e);
//             if(h.contains(s.substring(i,e))){
             
//                 dp[i]=true;
//                 e=i;
//             }
//         }
//         return dp[0];
    }
    boolean helper(String s,int start,int ind,HashSet<String> h,int dp[][]){
        
        if(start==s.length()){
            return true;
        }
        if(ind==s.length()){
            return false;
        }
        if(dp[start][ind]!=-1){
           if(dp[start][ind]==0)
           {
            return false;   
           }else{
               return true;
           }
        }
        if(h.contains(s.substring(start,ind+1))){            
        if(helper(s,ind+1,ind+1,h,dp)){
            dp[start][ind]=1;
            return true;
        }
        }
        if(helper(s,start,ind+1,h,dp)){
            dp[start][ind]=1;
            return true;
        }
        dp[start][ind]=0;
        return false;
        
    }
}