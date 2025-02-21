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
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }
        TreeNode newRoot = new TreeNode(root.val);
        ahyes(root,newRoot);
        return newRoot;
    }

    public void ahyes(TreeNode node, TreeNode invertNode ){
        if(node == null){
            return;
        }
        if(node.right != null){
            TreeNode newLeft = new TreeNode(node.right.val);
            invertNode.left = newLeft;
            ahyes(node.right, invertNode.left);
        }

        if(node.left != null){
            TreeNode newRight = new TreeNode(node.left.val);
            invertNode.right = newRight;
            ahyes(node.left, invertNode.right);
        };

        
    }
}