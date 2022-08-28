class Solution {
    public int uniqueMorseRepresentations(String[] words) {
    	Set<String> transformation = new HashSet<>();
    	String[] moorse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",
    			".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    	for(String word : words) {
    		StringBuilder sb = new StringBuilder();
    		
    		for(int i=0;i<word.length();i++) {
    			sb.append(moorse[word.charAt(i)-97]);
    		}
    		transformation.add(sb.toString());
    	}
    	
		return transformation.size();
    }
}
