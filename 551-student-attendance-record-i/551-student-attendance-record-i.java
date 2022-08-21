class Solution {
    public boolean checkRecord(String s) {
        if(s.contains("LLL")) {
			return false;
		}
		else {
			s=s.replace("L","");
		}
		if(s.length()-s.replace("A", "").length()>1) {
			return false;
		}
		
		return true;
    }
}