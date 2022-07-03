class Solution {
    public int wiggleMaxLength(int[] nums) {
       int n=nums.length;
        if(n<2){
            return n;
        }
        int prev=nums[1]-nums[0];
        int ans= prev!=0?2:1;
        for(int i=2;i<n;i++){
            int curr=nums[i]-nums[i-1];
            if(curr>0&&prev<=0){
                ans++;
                prev=curr;
            }
            else if(curr<0&&prev>=0){
                ans++;
                prev=curr;
            }
            
        }
        return ans;
    }
}