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
    public void level(List<List<Integer>> ans, TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> levelList = new ArrayList<>();
        if(root == null) return;
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode currNode = q.remove();
            if(currNode == null){
                ans.add(new ArrayList<>(levelList));
                levelList.clear();
                if(q.isEmpty()) break;
                else q.add(null);
            }else{
                levelList.add(currNode.val);
                if(currNode.left != null) q.add(currNode.left);
                if(currNode.right != null) q.add(currNode.right);
            }
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        level(ans, root);
        return ans;
    }
}