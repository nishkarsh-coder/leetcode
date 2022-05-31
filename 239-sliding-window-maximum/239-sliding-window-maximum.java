class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        Stack<Integer> st=new Stack<Integer>();
        st.push(n-1);
        int[] r=new int[n];
        r[n-1]=n;
        for(int i=n-2;i>=0;i--)
        {
            while(st.size()!=0&&nums[i]>=nums[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
               r[i]=n;
            }
            else{
                r[i]=st.peek();
            }
            st.push(i);
        }
        int j=0;
        int[] ans=new int[n-k+1];
        for(int i=0;i<n-k+1;i++){
            if(j<i){
                j=i;
            }
            while(r[j]<i+k){
                j=r[j];
            }
            // System.out.println(nums[j]);
            ans[i]=nums[j];
        }
        return ans;
    }
}