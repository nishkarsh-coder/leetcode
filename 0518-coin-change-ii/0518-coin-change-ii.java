class Solution {
    public int change(int amount, int[] coins) {
        
        int[][] dp=new int[coins.length][amount+1];
        for(int[] rows: dp){
            Arrays.fill(rows,-1);
        }
        
        return helper(0,amount,coins,dp);
    }
    
    int helper(int ind,int amount,int[] coins,int[][] dp){
        
        if(amount==0){
            return 1;
        }
        
        if(ind==coins.length){
            return 0;
        }
        
        if(dp[ind][amount]!=-1){
            return dp[ind][amount];
        }
        
        int not=helper(ind+1,amount,coins,dp);
        int pick=0;
        if(amount>=coins[ind]){
          pick=helper(ind,amount-coins[ind],coins,dp);
        }
        
        dp[ind][amount]=pick+not;
        return pick+not;
        
    }
    
}