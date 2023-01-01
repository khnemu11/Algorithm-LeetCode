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
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        getLength(root);
        
        return max;
    }

    public int getLength(TreeNode curr){
        if(curr == null){
            return 0;
        }
        
        int leftLength = getLength(curr.left);
        int rightLength = getLength(curr.right);
        
        max = Math.max(max , leftLength +rightLength);

        return Math.max(leftLength,rightLength)+1;
    }
}