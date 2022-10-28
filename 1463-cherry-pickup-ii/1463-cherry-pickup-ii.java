class Solution {
    public int cherryPickup(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][][] dp=new int[m][m][n];
        for(int[][] row: dp){
            for(int[] r:row){
        Arrays.fill(r,-1);                            
            }
        }
        return helper(0,m-1,0,grid,dp);
    }
   int helper(int col1,int col2,int row,int[][] grid,int[][][] dp){
        if(col1<0||col2<0||col1>=grid[0].length||col2>=grid[0].length||row>=grid.length){
            return 0;
        }
       // System.out.println(col1+" "+col2+" "+row);
        if(dp[col1][col2][row]!=-1){
            return dp[col1][col2][row];
        }
        // if(row==grid.length-1){
        //     return grid[col]
        // }
        int ans=0;
        ans =Math.max(ans,helper(col1,col2,row+1,grid,dp));
        ans =Math.max(ans,helper(col1,col2+1,row+1,grid,dp));
        ans =Math.max(ans,helper(col1,col2-1,row+1,grid,dp));
        ans =Math.max(ans,helper(col1+1,col2,row+1,grid,dp));
        ans =Math.max(ans,helper(col1+1,col2-1,row+1,grid,dp));
        ans =Math.max(ans,helper(col1+1,col2+1,row+1,grid,dp));
        ans =Math.max(ans,helper(col1-1,col2,row+1,grid,dp));
        ans =Math.max(ans,helper(col1-1,col2-1,row+1,grid,dp));
        ans =Math.max(ans,helper(col1-1,col2+1,row+1,grid,dp));
        if(col1==col2){
        dp[col1][col2][row]=ans+grid[row][col1];
        }else{
        dp[col1][col2][row]=ans+grid[row][col1]+grid[row][col2];            
        }
        return dp[col1][col2][row];
    }
    
}