class Solution {
    boolean visited[];
    public String reverseParentheses(String s) {
        visited = new boolean[s.length()];
        StringBuilder sb = new StringBuilder(reverse(s,0));
        
        return sb.reverse().toString();
    }
    public String reverse(String s, int curr){
        StringBuilder sb = new StringBuilder();
        
        for(int i=curr;i<s.length();i++){
            if(visited[i]){
                continue;
            }
            visited[i] = true;
            if(s.charAt(i) == '('){
                sb.append(reverse(s,i+1));
            }
            else if(s.charAt(i) == ')'){
                return sb.reverse().toString();
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.reverse().toString();
    }
}