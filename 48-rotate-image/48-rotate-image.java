class Solution {
    public void rotate(int[][] matrix) {
    transpose(matrix);
        
           
        // System.out.println(Arrays.toString(matrix[1]));
        
    reverse(matrix);
    }
    
    public void transpose(int[][] matrix){
        // int[][] arr=new int[matrix.length][matrix[0].length];
     for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
           }
        
        
    }
    
    public void reverse(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][matrix[0].length-j-1];
                matrix[i][matrix[0].length-1-j]=temp;
            }
        }
    }
    
}