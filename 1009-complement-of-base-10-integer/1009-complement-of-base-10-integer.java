class Solution {
    public int bitwiseComplement(int n) {
        
        String binaryStr = Integer.toBinaryString(n);
        StringBuilder sb= new StringBuilder();
        
        for(int i=0;i<binaryStr.length();i++){
            if(binaryStr.charAt(i)=='0'){
                sb.append(1);
            }
            else{
                sb.append(0);
            }
        }
        
        return Integer.parseInt(sb.toString(),2);
    }
}