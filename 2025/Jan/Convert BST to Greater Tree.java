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
    public void helper(int[] temp, TreeNode root) {
        if (root == null) {
            return;
        }
        helper(temp, root.right);
        temp[0] += root.val;
        root.val = temp[0];
        helper(temp, root.left);
    }

    public TreeNode convertBST(TreeNode root) {
        int[] temp = new int[1];
        helper(temp, root);
        return root;
    }
}