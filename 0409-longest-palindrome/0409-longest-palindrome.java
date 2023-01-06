class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> alphaMap = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            alphaMap.put(s.charAt(i),alphaMap.getOrDefault(s.charAt(i),0)+1);
        }
        int length = 0;
        boolean hasOdd = false;
        for(Character key : alphaMap.keySet()) {
	        int val = alphaMap.get(key);
            if(val%2==0){
                length +=val;
            }
            else{
                hasOdd=true;
                length+=val-1;
            }
	    }
        
        if(hasOdd){
            length++;
        }
        
        return length;
    }
}