class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        // int[][] dp=new int[nums.length][2];
        
        ans=0;
        helper(0,nums,target,0);
        return ans;
    }
    int ans;
    void helper(int row, int[] nums,int target,int sum){
        if(nums.length==row){
            if(sum==target){
                ans++;
            }
            return;
        }
        
        helper(row+1,nums,target,sum+nums[row]);
        helper(row+1,nums,target,sum-nums[row]);

    }
}