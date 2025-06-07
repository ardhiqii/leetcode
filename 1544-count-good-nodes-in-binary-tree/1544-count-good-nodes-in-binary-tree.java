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
    List<Integer> path = new ArrayList<>();
    List<Integer> maxPath = new ArrayList<>();
    int count = 0;
    public int goodNodes(TreeNode root) {
        dfs(root);
        return count;
    }
    private void dfs(TreeNode root){
        if(root == null){
            return;
        }
        if(maxPath.isEmpty()){
            maxPath.add(root.val);
            count++;
        }else if(root.val >= maxPath.get(maxPath.size()-1)){
            maxPath.add(root.val);
            count++;
        }
        path.add(root.val);
        dfs(root.left);
        dfs(root.right);
        if(path.size() > 1){
            path.remove(path.size() - 1);
            int lastMax = maxPath.get(maxPath.size()-1);
            if(lastMax == root.val){
                maxPath.remove(maxPath.size()-1);
            }
        }
        return;
    }
}