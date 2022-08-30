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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        if(root==null){
            return new ArrayList<Integer>();
        }
        List<Integer> a=postorderTraversal(root.left);
        List<Integer> a1=postorderTraversal(root.right);
        
        for(int i:a1){
            a.add(i);
        }
        a.add(root.val);

        return a;
    
    }
}