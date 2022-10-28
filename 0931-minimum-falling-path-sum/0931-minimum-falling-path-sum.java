class Solution {
    public int minFallingPathSum(int[][] matrix) {
        // int[][] dp=new int[matrix.length][matrix[0].length];
        // for(int[] row:dp){
        //     Arrays.fill(row,-1);
        // }
        // int ans=Integer.MAX_VALUE;
        // for(int i=0;i<matrix[0].length;i++){
        // ans=Math.min(ans,helper(i,0,matrix,dp)); 
        // //      for(int[] row:dp)
        // // System.out.println(Arrays.toString(row));
        // //     System.out.println();
        // }
        // for(int[] row:dp)
        // System.out.println(Arrays.toString(row));
        int m=matrix.length;
        int n=matrix[0].length;
        int[] prev=new int[n];
        for(int i=0;i<n;i++){
            prev[i]=matrix[0][i];
        }
        // System.out.println(Arrays.toString(prev));
        for(int i=1;i<m;i++){
            int[] curr=new int[n];
            for(int j=n-1;j>=0;j--){
                if(j==n-1){
                    // System.out.println(matrix[i][j]+" "+Math.min(prev[j],prev[j-1]));
                    curr[j]=matrix[i][j]+Math.min(prev[j],prev[j-1]);
                }else if(j==0){
                    curr[j]=matrix[i][j]+Math.min(prev[j],prev[j+1]);
                }else{
                    curr[j]=matrix[i][j]+Math.min(prev[j],Math.min(prev[j+1],prev[j-1]));
                }
                 // System.out.println(Arrays.toString(curr));   
            }
            prev=curr;
            // System.out.println(Arrays.toString(prev));
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            ans=Math.min(prev[i],ans);
        }
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