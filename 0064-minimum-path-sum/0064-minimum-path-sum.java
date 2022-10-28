class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[] prev=new int[n+1];
        for(int i=n-1;i>=0;i--){
            prev[i]=prev[i+1]+grid[m-1][i];
        }
        
        for(int i=m-2;i>=0;i--){
            int[] curr=new int[n+1];
            for(int j=n-1;j>=0;j--){
                if(j==n-1){
                    curr[j]=grid[i][j]+prev[j];
                }else{
                curr[j]=grid[i][j]+Math.min(prev[j],curr[j+1]);                   
                }
            }
            prev=curr;
        }
        
        return prev[0];
    }
}