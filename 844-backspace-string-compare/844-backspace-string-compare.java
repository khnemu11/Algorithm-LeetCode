class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sbuilder = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == '#' && sbuilder.length()>0) {
				sbuilder = sbuilder.deleteCharAt(sbuilder.length()-1);
			}
			else if(s.charAt(i) != '#'){
				sbuilder.append(s.charAt(i));
			}
		}
		
		StringBuilder tbuilder = new StringBuilder();
		
		for(int i=0;i<t.length();i++) {
			if(t.charAt(i) == '#' && tbuilder.length()>0) {
				tbuilder = tbuilder.deleteCharAt(tbuilder.length()-1);
			}
			else if(t.charAt(i) != '#'){
				tbuilder.append(t.charAt(i));
			}
		}
		
		return tbuilder.toString().equals(sbuilder.toString());
    }
}