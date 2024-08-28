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
    public void RecursivInorder(TreeNode root, ArrayList<Integer> res){
        if(root==null){
            return;
        }
        RecursivInorder(root.left,res);
        res.add(root.val);
        RecursivInorder(root.right,res);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        RecursivInorder(root,res);
        return res;
    }
}