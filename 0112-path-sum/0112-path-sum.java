class Solution {
    int target;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        target = targetSum;
        if(root == null){
            return false;
        }
        else{
            return dfs(root,0);
        }
    }
    public boolean dfs(TreeNode curr,int sum){
        if(curr.left == null && curr.right == null){
            if(target == sum+curr.val){
                return true;
            }
            else return false;
        }
        if(curr.left !=null && dfs(curr.left, curr.val+sum)){
            return true;
        }
        else if(curr.right!=null && dfs(curr.right, curr.val+sum)){
            return true;
        }
        else{
            return false;
        }
    }
}