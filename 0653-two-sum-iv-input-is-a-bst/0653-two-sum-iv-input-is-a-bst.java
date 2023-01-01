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
    public boolean findTarget(TreeNode root, int k) {
        Queue<TreeNode> queue = new LinkedList<>();
        HashMap<Integer,Boolean>map = new HashMap<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode curr = queue.poll();
            if(map.get(k-curr.val)!=null){
                return true;
            }
            
            if(curr.left!=null){
                queue.add(curr.left);
            }
            if(curr.right!=null){
                queue.add(curr.right);
            }
            map.put(curr.val,true);
        }

        return false;
    }
}