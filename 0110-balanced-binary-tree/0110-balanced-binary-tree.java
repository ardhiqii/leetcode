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
    boolean result = true;
    public boolean isBalanced(TreeNode root) {
        ohyeah(root);
        return result;
    }

    public int ohyeah(TreeNode node){
        if(node == null){
            return 0;
        }
        if(!result){
            return 0;
        }
        int left = ohyeah(node.left);
        int right = ohyeah(node.right);
        int diff = Math.abs(left-right);
        if(diff > 1){
            result = false;
            return 0;
        }
        return 1 + Math.max(left,right);
    }
}