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
    ArrayList<String> arr = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        dp(root,"");
        return arr;
    }
    private void dp(TreeNode root,String curr){
        if(root == null)return;
        curr =curr + Integer.toString(root.val);
        if(root.left == null && root.right == null){
            arr.add(curr);
            return;
        }
        curr += "->";
        dp(root.left,curr);
        dp(root.right,curr);
    }
}