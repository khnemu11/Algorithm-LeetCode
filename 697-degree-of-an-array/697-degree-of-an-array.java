class Solution {
	public int findShortestSubArray(int[]nums) {
        HashMap<Integer,Integer> count = new HashMap<>();
        List<Integer> length = new ArrayList<>();
		int maxCount =0;
        for(int i=0;i<nums.length;i++) {
        	int curr =0;
        	if(count.get(nums[i]) == null) {
        		count.put(nums[i], 1);
        		curr=1;
        	}
        	else {       		
        		curr = count.get(nums[i])+1;
        		count.put(nums[i], curr);
        	}
        	if(maxCount<curr) {
        		length.clear();
        		length.add(nums[i]);
        		maxCount=curr;
        	}
        	else if(maxCount==curr) {
        		length.add(nums[i]);
        	}
        }
        
        int shortest = Integer.MAX_VALUE;
        
        for(int i=0;i<length.size();i++) {
        	int l=0,r=nums.length-1;
  	        
  	        for(;l<nums.length;l++) {
  	        	if(nums[l] == length.get(i)) break;
  	        }
  	        for(;r<nums.length;r--) {
  	        	if(nums[r] == length.get(i)) break;
  	        }
  	        if(shortest > r-l+1) {
  	        	shortest = r-l+1;
  	        }
        }
	      
    	return shortest;
    }
}