class Solution {
    public String longestCommonPrefix(String[] strs) {
        String shortestWord = Arrays.stream(strs).filter(x->x.length() == 
				Arrays.stream(strs).mapToInt(j->j.length()).min().getAsInt()
				).findFirst().get();
		String answer="";
		
		
		for(int i=shortestWord.length();i>0;i--) {
			String prefix = shortestWord.substring(0,i);
			answer = prefix;
			for(int j=0;j<strs.length;j++) {
				if(!strs[j].startsWith(prefix)) {
					answer="";
					break;
				}
			}
			if(!answer.equals("")) return answer;
		}

		return answer;
    }
}