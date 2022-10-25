class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n=obstacleGrid.length;
        int m=obstacleGrid[0].length;
        int[][] dp=new int[n][m];
        // System.out.println(n+" "+m+" "+Arrays.toString(z));
        dp[n-1][m-1]=1;
        
        if(obstacleGrid[n-1][m-1]==1){
            return 0;
        }
        
        for(int i=n-1;i>=0;i--){
        for(int j=m-1;j>=0;j--){
           if(i==n-1&&j==m-1){
               
           }else if(i!=n-1&&j!=m-1){
               if(obstacleGrid[i][j]==1||(dp[i+1][j]==-1&&dp[i][j+1]==-1)){
                   dp[i][j]=-1;
               }else if(dp[i+1][j]==-1){
                   dp[i][j]=dp[i][j+1];
               }else if(dp[i][j+1]==-1){
                    dp[i][j]=dp[i+1][j];
               }else{
                   dp[i][j]=dp[i+1][j]+dp[i][j+1];
               }
           }else if(i==n-1){
               if(obstacleGrid[i][j]==1||dp[i][j+1]==-1){
                   dp[i][j]=-1;
               }else{
                    dp[i][j]=dp[i][j+1];
               }
           }else if(j==m-1){
               if(obstacleGrid[i][j]==1||dp[i+1][j]==-1){
                   dp[i][j]=-1;
               }else{
                    dp[i][j]=dp[i+1][j];
               }
           }
        }    
        }
        
        if(dp[0][0]==-1) return 0;
        return dp[0][0];
        
    }
}