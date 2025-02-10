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
    public boolean pathFunc(TreeNode root, int targetSum, int total){
        if(root == null){
            return false;
        }
        total += root.val;
        if(root.right == null && root.left == null){
            return (total == targetSum);
        }
        else{
            return pathFunc(root.left, targetSum, total) || pathFunc(root.right, targetSum, total);
        }
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return pathFunc(root, targetSum, 0);
    }
}