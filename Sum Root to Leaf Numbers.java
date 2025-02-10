/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public int sumTotal(TreeNode root, int total) {
        if(root == null){
            return 0;
        }
        total = total*10 + root.val;
        if(root.right == null && root.left == null){
            return total;
        }
        else{
            return sumTotal(root.left, total) + sumTotal(root.right, total);
        }
    }

    public int sumNumbers(TreeNode root) {
        return sumTotal(root, 0);
    }
}