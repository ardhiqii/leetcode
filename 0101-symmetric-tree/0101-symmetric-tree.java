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
    boolean same = true;
    public boolean isSymmetric(TreeNode root) {
        tree(root.left, root.right);
        return same;
    }
    private void tree(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return;
        }
        // System.out.println(left.val);
        // System.out.println(right.val);
        if(left == null || right == null){
            same = false;
            return;
        }
        if(left.val != right.val){
            same = false;
            return;
        }
        tree(left.left, right.right);
        tree(left.right, right.left);
        
    }
}