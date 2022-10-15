class Solution {
    public boolean divisorGame(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return help(n,dp)==0?false:true;
    }
    
    int help(int n,int dp[]){
        if(n==1){
            return 0;
        }
        
        if(dp[n]!=-1){
            return dp[n];
        }
        for(int i=1;i*i<n;i++){
            if(n%i==0)
            {
               if(help(n-i,dp)==0)return dp[n]=1;
            }   
        }
        return dp[n]=0;
    }
}