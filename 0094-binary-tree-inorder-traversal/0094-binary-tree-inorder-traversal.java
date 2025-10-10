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
    ArrayList<Integer> arr = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        dp(root);
        return arr;
    }
    private void dp(TreeNode root){
        if(root == null){
            return;
        }
        dp(root.left);
        arr.add(root.val);
        dp(root.right);
    }
}