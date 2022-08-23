class Solution {
    public String convertToTitle(int columnNumber) {
         StringBuilder result=new StringBuilder();
		     
		     int value = columnNumber;
		    
		     while(value>0) {    	 
		    	 if(value%26==0) {
		    		 result.append("Z");
		    		 value=value/26-1;
		    	 }
		    	 else {
		    		 result.append((char)(value%26+64));
		    		 value=value/26;
		    	 }
		     }
		     return result.reverse().toString();
    }
}