class Solution {
    public int[] findBall(int[][] grid) {
        
        int[] ans=new int[grid[0].length];
        
        for(int i=0;i<grid[0].length;i++){
            ans[i]=helper(grid,i);
        }
        
        return ans;
    }
    
    int  helper(int[][] arr,int col){
        int n=arr.length;
        int m=arr[0].length;
        
        int i=0;
        int j=col;
        
        while(i<n&&j<m){
            if(arr[i][j]==1){
            if(j+1<m && arr[i][j+1]==-1){
                return -1;
            }else if(j+1>=m){
                return -1;
            }                
            i=i+1;
            j=j+1;
            }else{
              if(j-1>=0 && arr[i][j-1]==1){
                return -1;
            }else if(j-1<0){
                return -1;
            }                
            i=i+1;
            j=j-1;  
            }
        }
        
        return j;
    }
}