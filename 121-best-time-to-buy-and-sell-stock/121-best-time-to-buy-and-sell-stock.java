class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        Stack<Integer> st=new Stack<Integer>();
        st.push(prices[n-1]);
        int ans=0;
        for(int i=n-2;i>=0;i--){
                          // System.out.println(st.peek()+" "+prices[i]);
            if(st.peek()>prices[i]){
                if(ans<st.peek()-prices[i]){
                 
                  ans=st.peek()-prices[i];
              }
               
            }
             else{
                    st.push(prices[i]);
                }
        }
        return ans;
    }
}