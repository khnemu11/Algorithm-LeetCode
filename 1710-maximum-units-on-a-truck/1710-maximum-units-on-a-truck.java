class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
    	Arrays.sort(boxTypes, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o2[1]-o1[1];
			}
    	});
    	
    	int count=0;
    	int result=0;
    	
    	for(int i=0;i<boxTypes.length;i++) {
    		if(truckSize>=boxTypes[i][0]+count) {
    			result+=boxTypes[i][1]*boxTypes[i][0];
    			count+=boxTypes[i][0];
    		}
    		else {
    			result+=(truckSize-count)*boxTypes[i][1];
    			break;
    		}
    	}
		return result;
        
    }
}