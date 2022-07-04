class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
          int i=n-1;
           int j=0;
           while(i>=0&&j<m){
                int num=matrix[i][j];
                if(num==target){
                    return true;
                }else if(num>target){
                    i--;
                }else{
                    j++;
                }
            }
        return false;
        }
    
}