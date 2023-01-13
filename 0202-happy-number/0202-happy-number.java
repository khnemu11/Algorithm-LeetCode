class Solution {
    public boolean isHappy(int n) {
        int happyNum=n;
        boolean visited [] =new boolean[1000000];
        while(true){
            if(happyNum==1){
                break;
            }
            char happyNumArr[] = String.valueOf(happyNum).toCharArray();
            happyNum=0;
            
            for(int i=0;i<happyNumArr.length;i++){
                happyNum+=Math.pow(happyNumArr[i]-'0',2);
            }
            if(visited[happyNum]){
                break;
            }
            visited[happyNum]=true;
        }
        
        if(happyNum==1){
            return true;
        }
        else{
            return false;
        }
    }
}