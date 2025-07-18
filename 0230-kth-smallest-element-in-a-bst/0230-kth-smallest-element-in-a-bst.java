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
    int lowest = 0;
    int value = -1;
    public int kthSmallest(TreeNode root, int k) {
        dfs(root,k);
        return value;
    }
    private void dfs(TreeNode root, int k){
        if(root == null)return;
        if(value != -1) return;
        dfs(root.left,k);
        lowest = lowest + 1;
        if(lowest == k){
            value = root.val;
        }else{
            dfs(root.right,k);
        }
        
    }
}