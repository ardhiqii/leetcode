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
    int res = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        huh(root,1);
        return res;
    }
    void huh(TreeNode node, int dep){
    if(node==null) return;
    if(node.left == null && node.right == null){
        res = Math.min(res,dep);
    }
    huh(node.left,dep+1);
    huh(node.right,dep+1);
    
    }
}