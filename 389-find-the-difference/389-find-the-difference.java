class Solution {
	public char findTheDifference(String s, String t) {
        int[] sAlpha = new int[26];
        
        for(int i=0;i<s.length();i++) {
        	sAlpha[s.charAt(i)-97]++;
        }
        for(int i=0;i<t.length();i++) {
        	sAlpha[t.charAt(i)-97]--;		
        	if(sAlpha[t.charAt(i)-97]<0) {
        		return t.charAt(i);
        	}
        }
        
    	return ' ';
    }
}