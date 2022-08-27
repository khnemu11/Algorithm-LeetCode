class Solution {
    public int[] twoSum(int[] numbers, int target) { 	
    	int [] result = new int [2];
    	result[0]=-1;
    	result[1]=-1;
    	
    	for(int firstElement=numbers[0];firstElement<=target/2;firstElement++) {
    		for(int j=0;j<numbers.length-1;j++) {
    			if(numbers[j] == firstElement) {
    				result[0] = j+1;
    				break;
    			}
    		}
    		if(result[0]==-1) {
    			continue;
    		}
    		
    		else {
    			for(int j=result[0];j<numbers.length;j++) {
        			if(numbers[j] == target-firstElement) {
        				result[1] = j+1;
        				break;
        			}
    			}
    		}
    		if(result[1]!=-1) {
    			break;
    		}
    		result[0]=-1;
    		result[1]=-1;
    	}
		return result;
    }
}