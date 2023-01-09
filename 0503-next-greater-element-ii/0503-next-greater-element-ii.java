class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int result[] = new int[nums.length];
        
        for(int i=0;i<result.length;i++){
            int next = i+1 <result.length ? i+1 : 0;
            
            while(true){
                if(next==i){
                    result[i]=-1;
                    break;
                }
                else if(nums[i]<nums[next]){
                    result[i] = nums[next];
                    break;
                }
                else{
                    next = next+1 <result.length ? next+1 : 0;    
                }
            }
        }
        
        return result;
    }
}