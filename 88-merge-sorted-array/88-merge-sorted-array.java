class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int len=nums1.length-1;
        while(j>=0){
        if(i==-1||nums1[i]<nums2[j]){
            nums1[len]=nums2[j];
            j--;
            len--;
        }
        else{
            nums1[len]=nums1[i];
            len--;
            i--;
        }
        }
    }
}