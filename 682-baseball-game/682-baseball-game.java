class Solution {
    public int calPoints(String[] ops) {
         int [] result = new int[ops.length];
		        int count=0;
		          for(int i=0;i<ops.length;i++) {
		        	if(ops[i].equals("C")) {
		        		result[count-1]=0;
		        		count--;
		        	}
		        	else if(ops[i].equals("D")) {
		        		result[count]=result[count-1]*2;
		        		count++;
		        	}
		        	else if(ops[i].equals("+")) {
		        		result[count]=result[count-1]+result[count-2];
		        		count++;
		        	}
		        	else {
		        		result[count]=Integer.valueOf(ops[i]);
		        		count++;
		        	}
		        }
		        
		        return Arrays.stream(result).sum();
    }
}