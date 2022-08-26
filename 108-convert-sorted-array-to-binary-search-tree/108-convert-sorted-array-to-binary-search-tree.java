class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
    	TreeNode baseTree = sort(nums, 0, nums.length-1);

        return baseTree;
    }
    public TreeNode sort(int[] nums, int start, int end) {
    	if(start>end) {
    		return null;
    	}
    	
    	int mid = (start+end)/2;
    	
    	TreeNode node = new TreeNode(nums[mid],sort(nums,start,mid-1),sort(nums,mid+1,end));
    	
        return node;
    }
}