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
    public int minCameraCover(TreeNode root) {
        min=0;
        if(root==null){
            return 0;
        }
        int i=tell(root);
        System.out.println(i);
        if(i==-1){
            min++;
        }
        return min;
    }
    int min=0;
    int tell(TreeNode node){
        if(node.left==null&&node.right==null){
            return -1;
        }
        int camera=-1;
        if(node.left!=null){
        int i=tell(node.left);
         if(i==-1){
             // min++;
             camera=0;
             min++;
         }else if(i==0){
             camera=1;
         }   
        }
        if(node.right!=null){
        int i=tell(node.right);
            if(i==-1){
                if(camera==-1||camera==1){
                    camera=0;
                    min++;
                }
            }else if(i==0){
                if(camera==-1){
                camera=1;                    
                }
            }
        }
        
        return camera;

    }
}