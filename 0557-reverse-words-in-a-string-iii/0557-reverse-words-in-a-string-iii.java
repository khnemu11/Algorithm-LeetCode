class Solution {
    public String reverseWords(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder reverse = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)== ' '){
                while(!stack.isEmpty()){
                    reverse.append(stack.pop());
                }
                reverse.append(" ");
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        while(!stack.isEmpty()){
            reverse.append(stack.pop());
        }
        
        return reverse.toString();
    }
}