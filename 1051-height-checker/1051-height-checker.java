class Solution {
    public int heightChecker(int[] heights) {
        	int result=0;
			
			int [] sortedHeight = Arrays.copyOf(heights, heights.length);
			Arrays.sort(heights);
			
			for(int i=0;i<heights.length;i++) {
				if(heights[i]!=sortedHeight[i]) {
					result++;
				}
			}
			
			return result;
    }
}