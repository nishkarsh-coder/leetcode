class Solution {
    public int lengthOfLIS(int[] nums) {
        int[][] dp=new int[nums.length][nums.length+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return helper(0,-1,nums,dp);
    }    
    int helper(int i,int j,int[]nums,int[][]dp){
        if(i==nums.length){
            return 0;
        }
        if(dp[i][j+1]!=-1){
            return dp[i][j+1];
        }
        int ans=0;
        if(j!=-1&&nums[i]>nums[j]){
            ans=1+helper(i+1,i,nums,dp);
        }
        if(j==-1){
        ans=1+Math.max(ans,helper(i+1,i,nums,dp));                
        }
        ans=Math.max(ans,helper(i+1,j,nums,dp));            
        
        
        dp[i][j+1]=ans;
        
        return ans;
        
    }
}