class Solution {
    public int islandPerimeter(int[][] grid) {
        int sum=0;
        
        int upDown[] = {-1,1,0,0};
        int leftRight[] = {0,0,-1,1};
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 0){
                        continue;
                }
                
                for(int k=0;k<upDown.length;k++){
                    int nextRow = upDown[k] + i;
                    int nextCol = leftRight[k] + j;
                    
                    if(nextRow<0 || nextCol<0 || nextRow>=grid.length || nextCol>=grid[0].length || grid[nextRow][nextCol]==0){
                        sum++;          
                    }
                }
            }   
        }
        
        return sum;
    }
}