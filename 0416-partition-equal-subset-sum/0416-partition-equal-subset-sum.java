class Solution {
    public boolean canPartition(int[] nums) {
        // int total=Arrays.stream(nums).sum();
       int total=0;
        for(int i:nums){
           total+=i;
       }
        if(total%2==1){
            return false;
        }
        // int[][]dp=new int[nums.length][(total/2)+1];
        // HashMap<String , Boolean> dp=new HashMap<String,Boolean>();
        // System.out.println(total);
        
        // return helper(nums,0,total/2,total/2,dp);
        int n=total/2;
        boolean[] prev=new boolean[n+1];
        prev[0]=true;
        
        for(int i=nums.length-1;i>=0;i--){
            boolean[] curr=new boolean[n+1]; 
            for(int j=0;j<n+1;j++){
                curr[j]=prev[j];
                if(j-nums[i]>=0){
                    curr[j]=prev[j-nums[i]]||curr[j];
                }
            }
            prev=curr;
        }
        
        
        return prev[total/2];
    }
    
    boolean helper(int[] nums,int i,int sum1,int sum2,int[][][] dp){
        if(sum1<0){
            return false;
        }
        if(sum2<0){
            return false;
        }
        
        if(i==nums.length){
            if(sum1==0&&sum2==0){
                return true;
            }
            return false;
        }
        if(dp[i][sum1][sum2]!=-1){
            return dp[i][sum1][sum2]==1;
        }
        // if(dp.containsKey(i+"-"+sum1+"-"+sum2)){
        //     return dp.get(i+"-"+sum1+"-"+sum2);
        // }
        
        if(helper(nums,i+1,sum1-nums[i],sum2,dp))
            return true;
        
         if(helper(nums,i+1,sum1,sum2-nums[i],dp))
            return true;
        
        dp[i][sum1][sum2]=0;
        // dp.put(i+"-"+sum1+"-"+sum2,false);
        
        return false;
        
    }
}