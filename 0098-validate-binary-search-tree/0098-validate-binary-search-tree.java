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
    public boolean isValidBST(TreeNode root) {
        return sigma(root,Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean sigma(TreeNode root, long left, long right){
        if(root == null){
            return true;
        }
        if(!(root.val < right && root.val > left)){
            return false;
        }
        return(sigma(root.left,left,root.val) && sigma(root.right,root.val,right));
    }
}