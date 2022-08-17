class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        ans=new ArrayList<>();
        boolean[] used=new boolean[20];
        helper(nums,0,new ArrayList<>(),used);
        return ans;
    }
    List<List<Integer>> ans;
        void helper(int[] nums,int ind,List<Integer> a,boolean[] used){
            if(nums.length==ind){
                ans.add(new ArrayList<>(a));
                return;
            }
            if(used[10-nums[ind]]==true){
                helper(nums,ind+1,a,used);
            }else{
                
            a.add(nums[ind]);
            
            helper(nums,ind+1,a,used);
            a.remove(a.size()-1);
            used[10-nums[ind]]=true;
            helper(nums,ind+1,a,used);
            used[10-nums[ind]]=false;
            }

               
    }
}