class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int[] prev=new int[amount+1];
        Arrays.fill(prev,Integer.MAX_VALUE);
        prev[0]=0;
        int n=coins.length;
        for(int i=n-1;i>=0;i--){
            int[] curr=new int[amount+1];
            Arrays.fill(curr,Integer.MAX_VALUE);
            for(int j=0;j<=amount;j++){
                curr[j]=prev[j];
                if(coins[i]<=j){
                    int val1=curr[j-coins[i]];
                    if(val1!=Integer.MAX_VALUE){
                   curr[j]=Math.min(curr[j],1+val1);                         
                    }
                }
            }
            prev=curr;
        }
        if(prev[amount]==Integer.MAX_VALUE){
            return -1;
        }
        return prev[amount];
        
    }
}