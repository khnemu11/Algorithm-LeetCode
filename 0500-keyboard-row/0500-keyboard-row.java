import java.util.*;
class Solution {
    public String[] findWords(String[] words) {
        String[] row = {"qwertyuiop","asdfghjkl","zxcvbnm"};
        ArrayList<String> resultList = new ArrayList<>();
        for(String word : words){
            int targetRow = 0;
            
            if(row[1].contains(String.valueOf(word.charAt(0)).toLowerCase())){
                targetRow=1;
            }
            else if(row[2].contains(String.valueOf(word.charAt(0)).toLowerCase())){
                targetRow=2;
            }
            
            boolean isValid = true;
            
            
            for(int i=1;i<word.length();i++){
                if(!row[targetRow].contains(String.valueOf(word.charAt(i)).toLowerCase())){
                    isValid=false;
                    break;
                }
            }
            if(isValid){
                resultList.add(word);
            }
        }
        
        String[] result = resultList.toArray(new String[resultList.size()]);
        
        return result;
    }
}