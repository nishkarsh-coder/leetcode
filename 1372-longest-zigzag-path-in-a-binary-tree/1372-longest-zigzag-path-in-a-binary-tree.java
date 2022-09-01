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
    
    class pair{
        int l;
        int r;
        pair(){
            
        }
        pair(int l,int r){
            this.l=l;
            this.r=r;
        }
    }
    int c=2;
    public int longestZigZag(TreeNode root) {
        pair a=tell(root);
        System.out.println(a.l+" "+a.r);
        // return a.l>a.r?a.l:a.r;
        return ans;
    }
    int ans;
    pair tell(TreeNode root){
        if(root==null){
            return new pair(-1,-1);
        }
                c++;

        pair lc=tell(root.left);
        pair rc=tell(root.right);
        pair my=new pair(); 
        my.l= lc.r+1;
        my.r= rc.l+1;
        // System.out.println(c+" "+my.l+" "+my.r);
        // c--;
        if(ans<my.l){
            ans=my.l;
        }
        if(ans<my.r){
            ans=my.r;
        }
        return my;
    }
}