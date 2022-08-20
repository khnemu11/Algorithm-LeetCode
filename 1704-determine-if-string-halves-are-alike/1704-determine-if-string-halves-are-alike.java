class Solution {
    public boolean halvesAreAlike(String s) {
        int vowelCnt=0;
		List<String> vowelList = new ArrayList<>(Arrays.asList("a", "e", "i", "o", "u", "A", "E", "I", "O", "U"));
		
		
		for(int i=0;i<s.length()/2;i++) {
			if(vowelList.contains(String.valueOf(s.charAt(i)))) {
				vowelCnt++;
			}
		}
		for(int i=s.length()/2;i<s.length();i++) {
			if(vowelList.contains(String.valueOf(s.charAt(i)))) {
				vowelCnt--;
			}
			if(vowelCnt<0) {
				return false;
			}
		}
		if(vowelCnt>0) {
			return false;
		}
		else {
			return true;
		}
    }
}