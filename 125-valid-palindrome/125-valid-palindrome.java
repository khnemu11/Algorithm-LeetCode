class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		
		System.out.println(s);
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) != s.charAt(s.length()-(i+1))) {
				return false;
			}
		}
		return true;
    }
}