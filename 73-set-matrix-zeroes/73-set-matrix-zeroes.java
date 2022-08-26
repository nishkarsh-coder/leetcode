class Solution {
    public void setZeroes(int[][] matrix){
        int[] col=new int[matrix[0].length];
        int[] row=new int[matrix.length];

        int n=matrix.length;
        int m=matrix[0].length;
        
      for(int i=0;i<n;i++)
      {
          for(int j=0;j<m;j++){
              if(matrix[i][j]==0){
                  col[j]=1;
                  row[i]=1;
              }
          }
      }    
        
        for(int i=0;i<n;i++){
            if(row[i]==1){
            rows(matrix,i);
                
            }
        }
        
        for(int i=0;i<m;i++){
            if(col[i]==1){
            // rows(matrix,i);
            column(matrix,i);
            }            
        }
    }
    
    void column(int[][] matrix,int col){
        for(int i=0;i<matrix.length;i++){
            matrix[i][col]=0;
        }
    }
    void rows(int[][] matrix,int row){
        for(int i=0;i<matrix[0].length;i++){
            matrix[row][i]=0;
        }
    }
}