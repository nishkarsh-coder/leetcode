class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int[][] dp=new int[matrix.length][matrix[0].length];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<matrix[0].length;i++){
        ans=Math.min(ans,helper(i,0,matrix,dp)); 
        //      for(int[] row:dp)
        // System.out.println(Arrays.toString(row));
        //     System.out.println();
        }
        // for(int[] row:dp)
        // System.out.println(Arrays.toString(row));
        return ans;
    }
    
    int helper(int col,int row,int[][] matrix,int[][] dp){
        if(col<0||row<0||col>=matrix[0].length||row>=matrix.length){
            return Integer.MAX_VALUE;
        }
        if(dp[row][col]!=-1){
            return dp[row][col];
        }
        
        if(row==matrix.length-1){
           return matrix[row][col]; 
        }
        
        int anti=helper(col-1,row+1,matrix,dp);
        int diag=helper(col+1,row+1,matrix,dp);
        int down=helper(col,row+1,matrix,dp);
        dp[row][col]=matrix[row][col]+Math.min(anti,Math.min(diag,down));
        return matrix[row][col]+Math.min(anti,Math.min(diag,down));
    }
}