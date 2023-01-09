class Solution {
    public int repeatedStringMatch(String a, String b) {
        int result=0;
        int count=0;
        int repeatedCount =0;
        String repeatedString="";
        boolean last = false;
        
        String b1=b.replaceAll(a,"1");
        
        for(int i=0;i<b1.length();i++){
            if(b1.charAt(i)=='1'){
                result++;
                repeatedCount++;
            } 
        }
        
        
        while(true){
            repeatedString+=a;
            count++;
            if(repeatedString.contains(b)==true){
                if(repeatedString.equals(b)){
                    return count;
                }
                result = result + (count-repeatedCount);
                break;
            }
            else if(count > repeatedCount +2){
                return -1;
            }
        }
        
      
       return result;     
    }
}