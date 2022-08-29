class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int result=0;
        
        if(start<destination) {
        	for(int i=start;i<destination;i++) {
        		result+=distance[i];
        	}
        	
        	result=Math.min(result,IntStream.of(distance).sum()-result);
        }
        else if(start>destination) {
        	for(int i=start;i<distance.length;i++) {
        		result+=distance[i];
        	}
        	for(int i=0;i<destination;i++) {
        		result+=distance[i];
        	}
        	result=Math.min(result,IntStream.of(distance).sum()-result);
        }
    
    	return result;
    }
}