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
    public TreeNode increasingBST(TreeNode root) {
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr==null){
                continue;
            }
            pq.add(curr.val);
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
        
        TreeNode sorted = new TreeNode();
        TreeNode curr = sorted;
        
        while(!pq.isEmpty()){
            curr.val = pq.poll();
            if(!pq.isEmpty()){
                curr.right = new TreeNode();    
            }
            
            curr = curr.right;
        }        
        return sorted;
    }
}