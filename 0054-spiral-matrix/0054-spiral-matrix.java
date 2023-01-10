class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>list = new ArrayList<>();
        
        if(matrix.length==1){
            for(int i=0;i<matrix[0].length;i++){
                list.add(matrix[0][i]);
            }
        }
        else{
            boolean visited [][] = new boolean[matrix.length][matrix[0].length];
        
            int upDown[] = {0,1,0,-1};
            int leftRight[] = {1,0,-1,0};

            int row=0;
            int col=0;
            int move=0;
                
            while(true){
                visited[row][col]=true;
                list.add(matrix[row][col]);
                row = row+upDown[move];
                col = col+leftRight[move];
                int count =0;
                
                while(count<4){
                    if(row>=matrix.length || row<0||col>=matrix[0].length || col<0||visited[row][col]){
                        row -=upDown[move];
                        col-=leftRight[move];
                        move++;
                        if(move>=upDown.length){
                            move=0;
                        }
                        row+=upDown[move];
                        col+=leftRight[move];
                    }
                    else{
                        break;
                    }
                    count++;
                }
                if(count ==4){
                    break;
                }
                
               
            }    
        }
           
        
        return list;
    }
}