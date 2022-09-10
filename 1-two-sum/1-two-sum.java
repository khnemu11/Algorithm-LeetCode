class Solution {
    public int[] twoSum(int[] nums, int target) {
        Integer [] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        int l=0;
        int r=nums.length-1;
        int [] results = new int[2];
        Arrays.sort(nums);
        
        System.out.println(Arrays.toString(arr));
        while(l<r){
            if(nums[l]+nums[r] == target){
                results[0] = Arrays.asList(arr).indexOf(nums[l]);
                results[1] = Arrays.asList(arr).lastIndexOf(nums[r]);
                break;
            }
            else if(nums[l]+nums[r] < target){
                l++;
            }
            else {
                r--;
            }
        }
        
        return results;
    }
}