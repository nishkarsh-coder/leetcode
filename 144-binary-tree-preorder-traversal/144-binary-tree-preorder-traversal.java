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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        if(root==null){
            return new ArrayList<Integer>();
        }
        List<Integer> a=preorderTraversal(root.left);
        a.add(0,root.val);
        List<Integer> a1=preorderTraversal(root.right);
        
        for(int i:a1){
            a.add(i);
        }
        return a;
    
    }
}