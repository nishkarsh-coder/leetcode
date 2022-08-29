class Solution {
    public int maxProfit(int[] arr) {
        int profit=0;
        int n=arr.length;
        // int buy=arr[0];
        for(int i=1;i<n;i++){
            // profit+
                if(arr[i-1]<arr[i]){
                     profit+=arr[i]-arr[i-1];
                  }
           
            
        }
        return profit;
    }
}