class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp=new  int[word1.length()+1][word2.length()+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
       return helper(word1.length()-1,word2.length()-1,word1,word2,dp);
        // for(int i=1;i<=word1.length();i++){
        //     for(int j=1;j<=word2.length();j++){
        //         if(word1.charAt(i-1)==word2.charAt(j-1)){
        //             dp[i][j]=1+dp[i-1][j-1];
        //         }else{
        //             dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
        //         }
        //     }
        //     // System.out.println(Arrays.toString(dp[i]));
        // }
        // int ans=0;
        // int i=word1.length();
        // int j=word2.length();
        // int replace=0;
        // int insert=0;
        // while(i!=0&&j!=0){
        //     // System.out.println("enter"+" "+ans+" "+insert+" "+replace);
        //     if(word1.charAt(i-1)==word2.charAt(j-1)){
        //         if(replace>insert){
        //             ans=ans+replace;
        //         }else{
        //             ans=ans+insert;
        //         }
        //         // ans+=insert;
        //         // ans+=replace;
        //         replace=0;
        //         insert=0;
        //         i--;
        //         j--;
        //     }else if(dp[i-1][j]<dp[i][j-1]){
        //         insert++;
        //         j=j-1;
        //     }else{
        //         replace++;
        //         i=i-1;
        //     }
        //     // System.out.println(ans+" end"+" "+insert+" "+replace);
        // }
        // // System.out.println(replace+" "+j);
        // if(replace>0){
        //     if(replace>j){
        //         ans+=replace;
        //     }else{
        //         ans+=j;
        //     }
        // }else{
        // ans+=j;            
        // }
        // ans+=i;
        // return ans;
        
    }
    
    int helper(int i,int j,String s,String t,int[][] dp){
        
        if(j==-1){
            return i+1;
        }
            
        if(i==-1){
            return j+1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans=0;
        if(s.charAt(i)==t.charAt(j)){
        ans=helper(i-1,j-1,s,t,dp);
        }else{
        ans=Math.min(helper(i,j-1,s,t,dp),helper(i-1,j,s,t,dp));
        ans=Math.min(ans,helper(i-1,j-1,s,t,dp));
            if(ans!=Integer.MAX_VALUE){
            ans=ans+1;
            }
        }
        dp[i][j]=ans;
        return ans;
        
    }
    
}