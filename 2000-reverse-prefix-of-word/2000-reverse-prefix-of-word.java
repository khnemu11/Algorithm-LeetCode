class Solution {
    public String reversePrefix(String word, char ch) {
    	String result=word;
    	StringBuilder sb = new StringBuilder();
    	int startIndex=0;
    	boolean check=false;
    	for(int i=0;i<word.length();i++){
    		sb.append(word.charAt(i));
    		startIndex++;
    		if(word.charAt(i)==ch) {
    			check=true;
    			break;
    		}
    	}
    	if(check) result= sb.reverse().append(word.substring(startIndex)).toString();

		return result;
    }
}
