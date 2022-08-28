class Solution {
    public int[][] transpose(int[][] matrix) {
    	int [][] result = new int[matrix[0].length][matrix.length];
    	
    	for(int i=0;i<result.length;i++) {
    		for(int j=0;j<result[i].length;j++) {
    			result[i][j] = matrix[j][i];
    		}
    	}
    	
		return result;
        
    }
}