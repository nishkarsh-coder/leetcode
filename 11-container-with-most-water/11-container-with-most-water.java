class Solution {
    class pair{
        int val;
        int ind;
        pair(int val,int ind){
            this.val=val;
            this.ind=ind;
        }
        pair(){
            
        }
    }
    public int maxArea(int[] height) {
        int n=height.length;
        // pair left=new pair(0,-1)
        // pair right=new pair(0,-1);
        int left=0;
        int right=0;
        // left[0]=-1;
        Stack<Integer> st=new Stack<>();
        st.add(height[0]);
        int i=0;
        int j=n-1;
        int ans=0;
        while(i<j){
            ans=Math.max(ans,Math.min(height[i],height[j])*(j-i));
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }    
        }
                         return ans;
    }
}