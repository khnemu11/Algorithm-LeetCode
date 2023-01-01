class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int index = 0;
        while(k-->0){
            nums[index] = -nums[index];
            index++;
            if(index >= nums.length ){
                index--;
            }
            else if(nums[index]>0 && Math.abs(nums[index]) >= Math.abs(nums[index-1])){
                index--;
            }
        }

        int sum = Arrays.stream(nums).sum();


        return sum;
    }   
}