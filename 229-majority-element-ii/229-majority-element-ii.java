class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int size = nums.length/3;
        HashMap<Integer, Long> map = new HashMap<>();
        
        List<Integer> result = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==null){
                map.put(nums[i],1L);
            }
            else{
                if(map.get(nums[i])!=-1L){
                    map.put(nums[i],map.get(nums[i])+1L);    
                }
            }
             if(map.get(nums[i])>size){
                        result.add(nums[i]);
                        map.put(nums[i],-1L);
             }
        }
        
        return result;
    }
}