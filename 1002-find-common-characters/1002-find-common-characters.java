class Solution {
    public List<String> commonChars(String[] words) {
        int alpha[][] = new int[words.length][26];

        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                alpha[i][words[i].charAt(j)-'a']++;
            }
        }
        List<String> commonChars = new ArrayList<>();
        
        for(int i=0;i<alpha[0].length;i++){
            boolean isValid=true;
            int count = alpha[0][i];
            
            if(count == 0){
                continue;
            }
            
            for(int j=1;j<words.length;j++){
                if(alpha[j][i]==0){
                    isValid = false;
                    break;
                }
                count = Math.min(count,alpha[j][i]);
            }
            
            if(isValid){
                while(count>0){
                    commonChars.add(String.valueOf((char)('a'+i)));
                    count--;
                }
            }
        }
        return commonChars;
    }
}