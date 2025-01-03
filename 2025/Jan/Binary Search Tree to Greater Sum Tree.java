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
    public void bstToGstFunc(TreeNode root, int[] temp){
        if(root == null){
            return;
        }
        bstToGstFunc(root.right, temp);
        temp[0] += root.val;
        root.val = temp[0];
        bstToGstFunc(root.left, temp);
    }
    public TreeNode bstToGst(TreeNode root) {
        int[] temp = new int[1];
        bstToGstFunc(root, temp);
        return root;
    }
}