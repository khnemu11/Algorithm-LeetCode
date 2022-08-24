class Solution {
    public String removeDuplicates(String s) {
        	Stack<String> stack = new Stack<>();
			
			for(int i=0;i<s.length();i++) {
				if(!stack.isEmpty() && stack.peek().equals(String.valueOf(s.charAt(i)))) {
					stack.pop();
				}
				else {
					stack.add(String.valueOf(s.charAt(i)));
				}
			}
			String answer = "";
			
			int size =stack.size();
			
			for(int i=0;i<size;i++) {
				answer = stack.pop()+answer;
			}
			
			return answer;
    }
}