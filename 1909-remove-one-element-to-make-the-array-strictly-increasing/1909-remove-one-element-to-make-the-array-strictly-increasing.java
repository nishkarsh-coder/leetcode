class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int count=0;
        
        // Stack<Integer> st=new Stack();
        // st.push(nums[0]);
        int prev=nums[0];
        for(int i=1;i<nums.length;i++){
            
           if(count==2){
            return false;
            }
        
            if(prev>=nums[i]){
                count++;
                if(count==2){
                    return false;
                }
                else{
                    if(i>1&&nums[i-2]>=nums[i]){
                       prev=nums[i-1]; 
                    }
                    else{
                    prev=nums[i];
                    }
                }
            }
            else{
            prev=nums[i];
            }
            
        
        }
        if(count>=2){
        return false;
        }
        return true;
    }
}