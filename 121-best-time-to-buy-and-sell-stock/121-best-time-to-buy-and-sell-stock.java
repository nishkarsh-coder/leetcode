class Solution {
    public int maxProfit(int[] prices) {
        Stack<Integer> st=new Stack<>();
        st.add(prices[0]);
        int i=1;
        int ans=0;
        while(i<prices.length){
            
            if(st.peek()>prices[i]){
                st.push(prices[i]);
            }else{
                if(ans<prices[i]-st.peek()){
                ans=prices[i]-st.peek();                    
                }
            }
            i++;
        }
        return ans;
    }
}