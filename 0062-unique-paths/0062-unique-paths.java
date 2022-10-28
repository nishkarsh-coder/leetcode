class Solution {
    public int uniquePaths(int m, int n) {
        int[] row=new int[n+1];
        for(int i=0;i<n;i++){
            row[i]=1;
        }
        
        for(int i=m-2;i>=0;i--){
            int[] curr=new int[n+1];
            for(int j=n-1;j>=0;j--){
                curr[j]=row[j]+curr[j+1];
            }
            row=curr;
        }
        
        return row[0];
    }
}