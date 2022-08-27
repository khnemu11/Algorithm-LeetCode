class Solution {
    public int removeElement(int[] nums, int val) {
		int[] removedArray = Arrays.stream(nums).filter(x->x!=val).toArray();
 
		for(int i=0;i<removedArray.length;i++) {
			nums[i] = removedArray[i];
		}
    	
    	return removedArray.length;
        
    }
}