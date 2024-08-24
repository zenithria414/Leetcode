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
    public static ArrayList<Integer> printRange(TreeNode root, int low, int high, ArrayList<Integer> res)
    {
        if(root == null){
            return res;
        }
        if(root.val>=low && root.val<=high){
            printRange(root.left,low,high,res);
            res.add(root.val);
            printRange(root.right,low,high,res);
        }
        else if(root.val<=low){
            printRange(root.right,low,high,res);
        }
        else{
            printRange(root.left,low,high,res);
        }
        return res;
    } 
    public int rangeSumBST(TreeNode root, int low, int high) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        printRange(root,low,high,res);
        int sum =0;
        for(int i=0; i<res.size(); i++){
            sum += res.get(i);
        }
        return sum;
    }
}