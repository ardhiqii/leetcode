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
    public TreeNode sortedArrayToBST(int[] nums) {
        return huh(nums,0,nums.length-1);
    }
    TreeNode huh(int[] nums, int l, int r){
        if(l > r) return null;
        int m = (r+l)/2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = huh(nums,l, m-1);
        root.right = huh(nums,m+1,r);
        return root;   
    }
}