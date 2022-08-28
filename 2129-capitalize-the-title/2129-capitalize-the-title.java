class Solution {
    public String capitalizeTitle(String title) {
    	String [] words = title.split(" ");
    	
    	for(int i=0;i<words.length;i++) {
    		words[i]=words[i].toLowerCase();
    		if(words[i].length()>2) {
    			char first = words[i].charAt(0);
    			words[i] = Character.toUpperCase(first)+words[i].substring(1);
    		}
    	}
    	String result = String.join(" ", words);
    	
		return result;
    }
}
