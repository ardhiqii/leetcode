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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int deep = searching(root,1);
        
        return deep;
    }
    public int searching(TreeNode node, int curr){
        if(node == null) return curr - 1;
        int left = searching(node.left, curr+1);
        int right = searching(node.right, curr+1);
        return Math.max(left,right);
    }
}