class Solution {
    
//     public static void print(int[]nums){

//     for(int i=0;i<nums.length;i++){

//     System.out.print(nums[i]+" ");
    
//     }
//         System.out.println();
//     } 
    public int removeDuplicates(int[] nums) {
       
        int uni=1;
        for(int i=1;i<nums.length;i++){
        
        if(nums[i-1]!=nums[i]){
           nums[uni]=nums[i];
            uni++;
            // print(nums);
            
        }
        // System.out.println(nums[uni]+"  "+nums[i]);
        }            return uni;

    }
}