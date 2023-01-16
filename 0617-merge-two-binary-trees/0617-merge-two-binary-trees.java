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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode merged = mergeTrees(root1,root2,new TreeNode());        
        return merged;
    }
    
    public TreeNode mergeTrees(TreeNode curr1, TreeNode curr2,TreeNode currM) {
        if(curr1 ==null && curr2==null){
            return null;
        }
        currM.left = new TreeNode();
        currM.right = new TreeNode();
        
        if(curr1 !=null && curr2!=null){
            currM.val = curr1.val+curr2.val;
            currM.left = mergeTrees(curr1.left,curr2.left,currM.left);
            currM.right = mergeTrees(curr1.right,curr2.right,currM.right);
        }
        else if(curr1!=null){
            currM.val = curr1.val;
            currM.left = mergeTrees(curr1.left,null,currM.left);
            currM.right = mergeTrees(curr1.right,null,currM.right);
        }
        else{
            currM.val = curr2.val;
            currM.left = mergeTrees(null,curr2.left,currM.left);
            currM.right = mergeTrees(null,curr2.right,currM.right);
        }
        
       
        
        return currM;
    }
}