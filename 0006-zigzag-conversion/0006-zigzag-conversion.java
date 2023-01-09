class Solution {
    public String convert(String s, int numRows) {
        char [][] zigzag = new char[numRows][s.length()];
        int point =0;
        int count=0;
        String result="";
        boolean start = true;
        
        if(numRows==1){
             for(int i=0;i<s.length();i++){
                    zigzag[0][i]=s.charAt(i);
             }
        }
        else{
            for(int i=0;i<s.length();i++){
            if(start == true){
                zigzag[point][count] = s.charAt(i);
                point ++;
                if(point == numRows){
                    point -=2;
                    count++;
                    start = false;
                }
            }
            else{
                zigzag[point][count] = s.charAt(i);
                point --;
                count++;
                if(point ==-1){
                    point +=2;
                    count--;
                    start = true;
                }
            }
            
         }
        }
        
        
        for(int i=0;i<numRows;i++){
            for(int j=0;j<s.length();j++){
                if(zigzag[i][j]!=0){
                    result +=String.valueOf(zigzag[i][j]);
                }
            }
        }
        
        
        return result;
    }
}