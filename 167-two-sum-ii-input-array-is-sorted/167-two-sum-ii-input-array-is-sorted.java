class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length; 
        int i=0;
         int j=n-1;
        int[] ans=new int[2];
        while(i<j)
        {
         if(target==numbers[i]+numbers[j]){
            ans[0]=i+1;
             ans[1]=j+1;
                // System.out.println("1");
             break;
         }
            else if(target<numbers[i]+numbers[j]){
                j=j-1;
                   // System.out.println("2");
            }
            else{
                i=i+1;
                // System.out.println("3");
            }
        
        }
        return ans;
    }
}