class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb= new StringBuilder();
        sb.append(s);
        sb.append(s);
        sb.append(s);
        if(s.length()!=goal.length()) {
        	return false;
        }
        if(sb.toString().contains(goal)) {
        	return true;
        }
        
        return false;
    }
}