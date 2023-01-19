class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {        
        boolean visited[][] = new boolean[image.length][image[0].length];
        
        int currX = sr;
        int currC = sc;
        int upDown [] ={-1,1,0,0};
        int leftRight [] ={0,0,-1,1};
        int oriColor = image[sr][sc];
        
        Queue<Coordinate> q = new LinkedList<>();
        q.add(new Coordinate(currX,currC));
        
        while(!q.isEmpty()){
            Coordinate curr = q.poll();
            
            if(visited[curr.row][curr.col]){
                continue;    
            }
            
            visited[curr.row][curr.col]=true;
            image[curr.row][curr.col]=color;
            
            for(int k=0;k<upDown.length;k++){
                Coordinate next = new Coordinate(curr.row + upDown[k],curr.col + leftRight[k]);
                
                if(next.row<0 || next.col<0 || next.row>=image.length || next.col>=image[0].length){
                    continue;
                }
                if(visited[next.row][next.col] || image[next.row][next.col] !=oriColor){
                    continue;
                }
                
                image[next.row][next.col]=color;
                q.add(next);
            }
        }
        
        return image;
    }
}
class Coordinate{
    int row;
    int col;
    
    public Coordinate(int row, int col){
        this.row=row;
        this.col=col;
    }
}