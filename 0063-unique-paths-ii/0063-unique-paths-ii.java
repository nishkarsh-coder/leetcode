class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n=obstacleGrid.length;
        int m=obstacleGrid[0].length;
        int[] prev=new int[m+1];
        for(int i=m-1;i>=0;i--){
            if(i==m-1&&obstacleGrid[n-1][i]!=1){
            prev[i]=1;                
            }else if(obstacleGrid[n-1][i]!=1){
                prev[i]=prev[i+1];
            }
        }
        
        for(int i=n-2;i>=0;i--){
            int[] curr=new int[m+1];
            for(int j=m-1;j>=0;j--){
                if(obstacleGrid[i][j]!=1){
                    curr[j]=prev[j]+curr[j+1];
                }
            }
            prev=curr;
        }
        
        return prev[0];
    }
}