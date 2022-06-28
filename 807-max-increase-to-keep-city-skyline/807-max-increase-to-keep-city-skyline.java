class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n=grid.length;
        int[] row=new int[n];
        int[] col=new int[n];
        // int maxc=0;
        for(int i=0;i<grid.length;i++){
            int maxr=0;
            for(int j=0;j<grid[0].length;j++){
                if(maxr<grid[i][j]){
                    maxr=grid[i][j];
                }
            }
            row[i]=maxr;
        }
        
        for(int i=0;i<grid.length;i++){
            int maxc=0;
            for(int j=0;j<grid[0].length;j++){
                if(maxc<grid[j][i]){
                    maxc=grid[j][i];
                }
            }
            col[i]=maxc;
        }
        
        int ans=0;
        
        // for(int i: row){
        //     System.out.print(i+" ");
        // }
        // System.out.println();
        // for(int i: col){
        //     System.out.print(i+" ");
        // }
        
        for(int i=0;i<grid.length;i++){
            int maxr=0;
            for(int j=0;j<grid[0].length;j++){
               if(row[i]<col[j]){
                ans+=row[i]-grid[i][j];
                   // System.out.println(row[j]-grid[i][j]);
               }
                else{
                ans+=col[j]-grid[i][j];
                 // System.out.println(col[i]-grid[i][j]);

                }
            }
       
        }
        return ans;
    }
}