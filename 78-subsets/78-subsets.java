class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        ans =new ArrayList<List<Integer>>();
        
        // h
        
        helper(nums,0,new ArrayList<Integer>());
        
        return ans;
    }
    List<List<Integer>> ans;
    void helper(int[] nums,int index,List<Integer> a){
        if(index==nums.length)
        {
            ans.add(new ArrayList<>(a));
            return;
        }        
        
        a.add(nums[index]);
        helper(nums,index+1,a);
        a.remove(a.size()-1);
        helper(nums,index+1,a);

    }
}