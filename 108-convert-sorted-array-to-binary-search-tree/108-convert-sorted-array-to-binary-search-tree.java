/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        ListNode root=null;
        
        return bst(nums,0,nums.length-1);
    }
    TreeNode bst(int[]nums, int s,int e){
        if(s>e){
            return null;
        }
        if(s==e){
           return new TreeNode(nums[s]); 
        }
        int mid=(s+e)/2;
        TreeNode left=bst(nums,s,mid-1);        
        TreeNode right=bst(nums,mid+1,e);
        TreeNode temp=new TreeNode(nums[mid]);
        temp.left=left;
        temp.right=right;
        return temp;
    }
}