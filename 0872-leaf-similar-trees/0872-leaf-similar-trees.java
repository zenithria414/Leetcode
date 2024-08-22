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
    public void checkLeaf(TreeNode root, List<Integer> leafValues){
        if(root != null){
            if(root.left==null && root.right==null){
                leafValues.add(root.val);
            }
            checkLeaf(root.right,leafValues);
            checkLeaf(root.left,leafValues);
        }
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> tree1 = new ArrayList<>();
        List<Integer> tree2 = new ArrayList<>();
        
        checkLeaf(root1,tree1);
        checkLeaf(root2,tree2);
        
        return tree1.equals(tree2); //returns true if arraylists are equal
    }
}