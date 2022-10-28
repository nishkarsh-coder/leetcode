class Solution {
    public int cherryPickup(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][][] dp=new int[n][m][m];
        for(int[][] row: dp){
            for(int[] r:row){
        Arrays.fill(r,-1);                            
            }
        }
        // return helper(0,m-1,0,grid,dp);
        for(int i=0;i<m;i++){  //col1
            for(int j=0;j<m;j++){  //col2
                if(i==j){
                dp[n-1][i][j]=grid[n-1][i] ;                   
                }else{
            dp[n-1][i][j]=grid[n-1][i]+grid[n-1][j];                   
                }
            }
        }
        
        for(int k=n-2;k>=0;k--){
         for(int i=0;i<m;i++){  //col1
            for(int j=0;j<m;j++){  //col2
                int ans=0;
                for(int row=-1;row<2;row++){
                    for(int col=-1;col<2;col++){
                        if(i+row>=0&&j+col>=0&&i+row<m&&j+col<m){
                        ans=Math.max(ans,dp[k+1][i+row][j+col]);
                        }
                    }
                }
                
                if(i==j){
                dp[k][i][j]=grid[k][i]+ans;                   
                }else{
                dp[k][i][j]=grid[k][i]+grid[k][j]+ans;                   
                }
            }
        }   
        }
        
        return dp[0][0][m-1];
        
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