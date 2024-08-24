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
    public TreeNode inorderSuccessor(TreeNode root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
        //search root that has value to delete
        if(root.val<key){
            root.right = deleteNode(root.right,key);
        }
        else if(root.val>key){
            root.left = deleteNode(root.left,key);
        }
        else{ //root.val==key and key found to delete
            //case 1 -> no child node
            if(root.left==null && root.right==null){
                return null;
            }   
            //case 2 -> one child node
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            //case 3 -> two child node
            TreeNode inorderSuc = inorderSuccessor(root.right);
            root.val = inorderSuc.val;
            root.right = deleteNode(root.right,inorderSuc.val);
        }
        return root;
    }
}