class Solution {
    public int removeElement(int[] nums, int val) {
        
        int swap=0;
        for(int i=0;i<nums.length;i++){
        
            if(nums[i]!=val){
            int temp=nums[swap];
                nums[swap]=nums[i];
            nums[i]=temp;
                swap++;
            }
        
        
        }
        return swap;
    }
}