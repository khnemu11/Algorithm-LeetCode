class Solution {
    public boolean isValid(String s) {	
    	Stack<Character> stack = new Stack<>();
    	
    	for(int i=0;i<s.length();i++) {
    		if(!stack.isEmpty() && s.charAt(i) == ')') {
    			if(stack.peek().equals('(')) {
    				stack.pop();
    			}
    			else {
    				System.out.println(stack.peek() + "  "+s.charAt(i));
    				return false;
    			} 
    		}
    		else if(!stack.isEmpty() && s.charAt(i)=='}') {
    			if(stack.peek().equals('{')) {
    				stack.pop();
    			}
    			else return false;
    		}
    		else if(!stack.isEmpty() && s.charAt(i)==']') {
    			if(stack.peek().equals('[')) {
    				stack.pop();
    			}
    			else return false;
    		}
    		else{
    			stack.push(s.charAt(i));
    		}
    	}
    	if(stack.isEmpty())	return true;
    	else	return false;
    }
}