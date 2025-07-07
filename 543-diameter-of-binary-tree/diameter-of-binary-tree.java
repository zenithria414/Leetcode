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
    public int height (TreeNode root){
        if(root == null){
            return 0;
        }
        int rightHeight = height(root.right);
        int leftHeight = height(root.left);
        return Math.max(rightHeight,leftHeight)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        int totalDia = height(root.left)+height(root.right);
        int leftDia = diameterOfBinaryTree(root.left);
        int rightDia = diameterOfBinaryTree(root.right);
        
        return Math.max(Math.max(leftDia, rightDia),totalDia);
    }
}