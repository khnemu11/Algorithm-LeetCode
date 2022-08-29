class Solution {
    public void moveZeroes(int[] nums) {
        int []removed = Arrays.stream(nums).filter(x->x!=0).toArray();
        int count = nums.length-removed.length;
        for(int i=0;i<removed.length;i++) {
        	nums[i]=removed[i];
        }
        for(int i=removed.length,k=0;k<count;i++,k++) {
        	nums[i]=0;
        }
    }
}