class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int i=n-1;
        int j=0;
        
//         for(int i=0;i<m+n-1;i++){
            
//         }
        
        while(j<m){
            int val=matrix[i][j];
            int i_old=i;
            int j_old=j;
            while(i<n&&j<m){
                if(val!=matrix[i][j]){
                    return false;
                }
                i++;
                j++;
            }
            // System.out.println(i+" "+j);
            if(j-i>=0){
            j=j_old+1;
            i=0;    
            }
            else{
            i=i_old-1;
            j=0;
            }
            
        }
        
        return true;
       
        
    }
}