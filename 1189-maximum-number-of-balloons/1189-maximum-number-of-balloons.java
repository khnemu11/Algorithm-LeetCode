class Solution {
    public int maxNumberOfBalloons(String text) {
    	int aCount=0;
    	int bCount=0;
    	int lCount=0;
    	int nCount=0;
    	int oCount=0;
    	int result=0;
    	
    	for(int i=0;i<text.length();i++) {
    		if(text.charAt(i)=='a') aCount++;
    		else if(text.charAt(i)=='b') bCount++;
    		else if(text.charAt(i)=='l') lCount++;
    		else if(text.charAt(i)=='o') oCount++;
    		else if(text.charAt(i)=='n') nCount++;
    	}
    	while(true) {
    		if(aCount>0 && bCount>0 && lCount>1 && oCount>1 && nCount>0) {
        		aCount=aCount-1;
        		bCount=bCount-1;
        		lCount=lCount-2;
        		nCount=nCount-1;
        		oCount=oCount-2;
        		result++;
        	}
    		else {
    			break;
    		}
    	}
		return result;
        
    }
}