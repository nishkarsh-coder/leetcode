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
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        return tell(pre,0,pre.length-1,post,0,post.length-1);
    }
    TreeNode tell(int[] pre,int s1,int e1,int[] post,int s2,int e2){
        if(s2>e2){
            return null;
        }
        TreeNode root=new TreeNode(pre[s1]);
        if(s1==e1){
            return root;
        }
        System.out.println(s1+" "+e1);
        int t=pre[s1+1];
        int idx1=s2;
        while(post[idx1]!=pre[s1+1]){
            idx1++;
        }
        
        int count=idx1-s2+1;
        root.left=tell(pre,s1+1,s1+count,post,s2,idx1);
        root.right=tell(pre,s1+count+1,e1,post,idx1+1,e2-1);
            return root;
    }
    
}