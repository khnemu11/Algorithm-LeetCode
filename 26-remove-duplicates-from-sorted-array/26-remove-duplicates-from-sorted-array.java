class Solution {
    public int removeDuplicates(int[] nums) {
       int [] removed = Arrays.stream(nums).distinct().toArray();
	     
		 
	     for(int i=0;i<removed.length;i++) {
	    	 nums[i]=removed[i];
	     }
		 
		 return removed.length;
    }
}