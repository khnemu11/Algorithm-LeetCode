class Solution {
    int result;
    
    public int subsetXORSum(int[] nums) {
       
        for(int i=1;i<=nums.length;i++){
            select(0,nums,0,i,0);
        }
        
        
        return result;
    }
    
    public void select(int curr, int[]nums,int idx,int limit,int sum){
        if(curr == limit){
            result+=sum;   
        }
       
        else{
            for(int i=idx;i<nums.length;i++){
                select(curr+1,nums,i+1,limit,sum^nums[i]);
            }    
        }
        
    }
}