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
    class Info{
        int ht;
        int diam;
        Info(int ht, int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }
    // public int height (TreeNode root){
    //     if(root == null){
    //         return 0;
    //     }
    //     int rightHeight = height(root.right);
    //     int leftHeight = height(root.left);
    //     return Math.max(rightHeight,leftHeight)+1;
    // }
    public Info diameter(TreeNode root){
        if(root == null){
            return new Info(0,0);
        }
        
        Info leftDia = diameter(root.left);
        Info rightDia = diameter(root.right);

        int ht = Math.max(leftDia.ht, rightDia.ht)+1;
        int selfDia = leftDia.ht + rightDia.ht ;
        int dia = Math.max(selfDia, Math.max(leftDia.diam, rightDia.diam));

        return new Info(ht, dia);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int diam = diameter(root).diam;
        return diam;
    }
}