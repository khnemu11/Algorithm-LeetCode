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
    public boolean isSymmetric(TreeNode root) {
        boolean isMirror=true;
        boolean isFinish=false;
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root.left);
        queue.add(root.right);

        while(!queue.isEmpty() || !isFinish){
            int size = queue.size();
            isFinish=true;
            Stack<Integer> stack = new Stack<>();

            for(int i=0;i<size/2;i++){
                TreeNode curr = queue.poll();
                if(curr == null){
                    stack.add(-1000);
                   
                }
                else{
                    isFinish=false;
                    stack.add(curr.val);
                     queue.add(curr.left);
                    queue.add(curr.right);
                }
            }

            for(int i=size/2;i<size;i++){
                TreeNode curr = queue.poll();
                int compare = -1000;
                
                if(curr != null){
                    compare = curr.val;
                    queue.add(curr.left);
                    queue.add(curr.right);    
                }
                if(stack.isEmpty() || stack.pop() != compare){
                    isFinish=true;
                    isMirror=false;
                    break;
                }       
            }


        }

        return isMirror;
    }
}