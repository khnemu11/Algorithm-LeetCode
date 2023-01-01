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
    ArrayList<Integer> list = new ArrayList<>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        dfs(root);
        return list;    
    }

    public void dfs(TreeNode curr){
        if(curr==null){
            return ;
        }
        
        dfs(curr.left);
        list.add(curr.val);
        dfs(curr.right);
        
    }
}