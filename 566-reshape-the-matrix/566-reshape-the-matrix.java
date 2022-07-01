class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] ans=new int[r][c];
        int x=0;
        int y=0;
        if(r*c!=mat.length*mat[0].length){
        return mat;
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[i][j]=mat[y][x];
                // System.out.println("i"+i+"j"+j+"x"+x+"y"+y);
                if(x==mat[0].length-1){
                    x=0;
                    y++;
                }else{
                x++;
                }
            }
        }
        return ans;
    }
}