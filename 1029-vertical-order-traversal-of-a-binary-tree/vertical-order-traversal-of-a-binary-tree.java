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
    public class Info{
        TreeNode node;
        int row;
        int col;
        Info(TreeNode node, int row, int col){
            this.node = node;
            this.row = row;
            this.col = col;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(root,0,0));
        Map<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();

        while(!q.isEmpty()){
            Info curr = q.remove();
            TreeNode node = curr.node;
            int row = curr.row;
            int col = curr.col;
        
            map.putIfAbsent(col, new TreeMap<>());
            map.get(col).putIfAbsent(row, new PriorityQueue<>()); 
            map.get(col).get(row).add(node.val); 

            if (node.left != null) {
                q.add(new Info(node.left, row + 1, col - 1));
            }
            if (node.right != null) {
                q.add(new Info(node.right, row + 1, col + 1));
            }
        }

        for (TreeMap<Integer, PriorityQueue<Integer>> rows : map.values()) {
            List<Integer> colList = new ArrayList<>();
            for (PriorityQueue<Integer> pq : rows.values()) {
                while (!pq.isEmpty()) {
                    colList.add(pq.poll());
                }
            }
            result.add(colList);
        }
        return result;
    }
}