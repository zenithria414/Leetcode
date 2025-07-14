/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean getPath(TreeNode root, TreeNode n, ArrayList<TreeNode> path){
        if(root == null) return false;
        path.add(root);
        if(root.val == n.val) return true;

        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if(foundLeft || foundRight) return true;
        path.remove(path.size()-1);
        return false;

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> p1 = new ArrayList<>();
        ArrayList<TreeNode> p2 = new ArrayList<>();
        getPath(root, p, p1);
        getPath(root, q, p2);

        int i=0;
        for(; i<p1.size() && i<p2.size(); i++){
            if(p1.get(i)!=p2.get(i)) break;
        }
        TreeNode lca = p1.get(i-1);
        return lca;
    }
}