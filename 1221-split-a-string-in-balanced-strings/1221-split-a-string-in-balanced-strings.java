class Solution {
    public int balancedStringSplit(String s) {
        int R=0;
        int L=0;
        int cnt=0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                R++;
            }
            else{
                L++;
            }
            
            if(R==L){
                cnt++;
            }
        }
        
        return cnt;
    }
}