class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        
        for(int i=0;i<n;i++){
            ans[nums[i]]++;
            if(ans[nums[i]]>1){
                return nums[i];
            }
        }
        return -1;
    }
}