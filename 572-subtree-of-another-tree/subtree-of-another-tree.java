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

    public boolean isIdentical(TreeNode root, TreeNode subroot){
        if(root == null && subroot == null) return true;
        else if(root == null || subroot == null || root.val != subroot.val) return false;
        return isIdentical(root.left, subroot.left) && isIdentical(root.right, subroot.right);
    }

    public boolean isSubtree(TreeNode root, TreeNode subroot){
        if(root == null) return false;
        if(root.val == subroot.val){
            if(isIdentical(root, subroot)) return true;
        }
        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);

    }
    // public boolean isIdentical(TreeNode root, TreeNode subRoot){
    //     if(root == null && subRoot == null){
    //         return true;
    //     }
    //     if(root == null || subRoot == null){
    //         return false;
    //     }
    //     if(root.val == subRoot.val){
    //         return isIdentical(root.left,subRoot.left) && isIdentical(root.right,subRoot.right);
    //     }
    //     return false;
    // }
    // public boolean isSubtree(TreeNode root, TreeNode subRoot) {
    //     if(subRoot == null){
    //         return false;
    //     }
    //     if(root == null){
    //         return false;
    //     }
    //     if(isIdentical(root,subRoot)){
    //         return true;
    //     }
    //     return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    // }
}