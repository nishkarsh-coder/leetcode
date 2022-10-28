class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();    
        int m=triangle.get(n-1).size();
//         int[][] dp=new int[n][m];
//         System.out.println(n+" "+m);
//         for(int i=0;i<m;i++){
//             dp[n-1][i]=triangle.get(n-1).get(i);
//         }
//         for(int i=n-2;i>=0;i--){
//             for(int j=i;j>=0;j--){
//                 dp[i][j]=triangle.get(i).get(j)+Math.min(dp[i+1][j],dp[i+1][j+1]);
//             }
//         }
        
//         return dp[0][0];
        
        int[] prev=new int[m];
        // Arrays.fill(prev,Integer.MAX_VALUE);
        for(int i=0;i<m;i++){
            prev[i]=triangle.get(n-1).get(i);
        }
        // System.out.println(Arrays.toString(prev));
        for(int i=n-2;i>=0;i--){
            int[] curr=new int[i+1];
            for(int j=i;j>=0;j--){
                curr[j]=triangle.get(i).get(j)+Math.min(prev[j],prev[j+1]);
            }
            prev=curr;
            // System.out.println(Arrays.toString(prev));
        }
        
        return prev[0];
        
        
    }
    
}