class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
        if(hm.containsKey(nums[i])){
            return true;
        }
            hm.put(nums[i],1);

        }
        return false;
    }
}