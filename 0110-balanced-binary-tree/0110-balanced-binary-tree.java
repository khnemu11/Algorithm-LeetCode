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
    boolean isBalance;
    public boolean isBalanced(TreeNode root) {
        isBalance=true;
        
        height(root);
        
        return isBalance;
    }   
    
    public int height(TreeNode curr){
        if(curr==null){
            return 0;
        }
        else if(curr.left==null && curr.right==null){
            return 1;
        }
        else{
            int left = height(curr.left);
            int right = height(curr.right);
            
            int heightDiffer = Math.abs(left-right);
            
            if(heightDiffer>1){
                isBalance=false;
            }
            
            return Math.max(left,right)+1;
        }
    }
}