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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        huh(p,q);
        return same;
    }

    public void huh(TreeNode p,TreeNode q){
        if(p == null && q == null) return;
        if (p == null || q == null) {
            same = false;
            return;
        }
        if(!same) return;
        if(p.val != q.val){
            same = false;
            return;
        }

        huh(p.left,q.left);
        huh(p.right,q.right);
    }
}