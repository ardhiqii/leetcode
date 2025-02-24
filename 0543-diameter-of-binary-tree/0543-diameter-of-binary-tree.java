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
    int result = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int temp = lmao(root);
        return result;
    }
    public int lmao(TreeNode node){
        if(node == null){
            return 0;
        }
        int left = lmao(node.left);
        int right = lmao(node.right);
        result = Math.max(result, (left+right));
        return 1 + Math.max(left,right);
    }
}