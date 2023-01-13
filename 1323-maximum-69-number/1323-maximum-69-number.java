class Solution {
    public int maximum69Number (int num) {
        char numChar [] = String.valueOf(num).toCharArray();
        for(int i=0;i<numChar.length;i++){
            if(numChar[i] == '6'){
                numChar[i]='9';
                break;
            }
        }
        
        int max = Integer.valueOf(String.valueOf(numChar));
        
        return max;
    }
}