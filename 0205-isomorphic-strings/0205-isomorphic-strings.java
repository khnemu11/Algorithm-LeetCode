class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character>sToTMap = new HashMap<>();
        Map<Character,Character>tToSMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(sToTMap.get(s.charAt(i)) == null){
                sToTMap.put(s.charAt(i),t.charAt(i));
            }
            else if(sToTMap.get(s.charAt(i))!=t.charAt(i)){
                    return false;
            }
            if(tToSMap.get(t.charAt(i)) == null){
                tToSMap.put(t.charAt(i),s.charAt(i));
            }
            else if(tToSMap.get(t.charAt(i))!=s.charAt(i)){
                    return false;
            }
        }
              
        return true;
    }
}