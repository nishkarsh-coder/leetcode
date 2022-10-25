class Solution {
    public int minFallingPathSum(int[][] grid) {
        int ans=Integer.MAX_VALUE;
        int[][] dp=new int[grid.length][grid.length];
        for(int[] row: dp){
            Arrays.fill(row,-1);
        }
        for(int i=0;i<grid.length;i++){
            ans=Math.min(ans,helper(0,i,grid,dp));
        }
        
        return ans;
    }
    
    int helper(int row, int col,int[][] grid,int[][] dp){
        if(row<0||col<0||row>=grid.length||col>=grid[0].length){
            return Integer.MAX_VALUE;
        }
        if(row==grid.length-1){
            return grid[row][col];
        }
        if(dp[row][col]!=-1){
            return dp[row][col]; 
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<grid.length;i++)
        {   if(i!=col){
        ans=Math.min(ans,helper(row+1,i,grid,dp));   
        }
        }
        if(ans==Integer.MAX_VALUE){
        dp[row][col]=grid[row][col];     
            return dp[row][col]; 
        }
        
        dp[row][col]=ans+grid[row][col];
        return dp[row][col]; 
    }
}