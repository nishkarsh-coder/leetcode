class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp=new int[nums.length];
        
        
        for(int i=nums.length-1;i>=0;i--){
            // dp[i]
            if(i==nums.length-1){
                dp[i]=nums[i];
            }else{
                if(nums[i]+dp[i+1]>nums[i]){
                    dp[i]=nums[i]+dp[i+1];
                }else{
                    dp[i]=nums[i];
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        int max=Integer.MIN_VALUE;
        for(int i:dp){
            max=max>i?max:i;
        }
        return max;
        
    }
}