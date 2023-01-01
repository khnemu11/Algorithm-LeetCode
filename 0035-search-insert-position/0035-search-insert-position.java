class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int index = nums.length;

        while(left <=right){
            int mid = (left + right)/2;
            if(nums[mid]== target){
                index = mid;
                break;
            }

            if(nums[mid]>target){
                index = mid;
                right = mid -1;
            }
            else{

                left = mid + 1;
            }
        }

        return index;
    }
}