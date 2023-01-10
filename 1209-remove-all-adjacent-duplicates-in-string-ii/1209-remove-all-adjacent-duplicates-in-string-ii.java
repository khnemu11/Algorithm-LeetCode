class Solution {
    public String removeDuplicates(String s, int k) {
        int alpha[] = new int[26];
        String result = " ";
        
        Stack<Node> stack  = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            Node curr = new Node(s.charAt(i));
            if(stack.isEmpty()){
                stack.push(curr);   
            }
            else if(stack.peek().val == curr.val){
                    curr.adj +=stack.peek().adj;
                    if(curr.adj == k){
                        int idx = k-1;
                        while(idx>0){
                            stack.pop();
                            idx--;
                        }
                    }
                    else{
                        stack.add(curr);    
                    }
                }
                else{
                    stack.push(curr);
                }
        }
        char numArr [] = new char[stack.size()];
        
        for(int i=numArr.length-1;i>=0;i--){
            numArr[i] = stack.pop().val;
        }
        System.out.println(Arrays.toString(numArr));
        result = String.valueOf(numArr);
        
        return result;
    }
}

class Node {
    char val;
    int adj;
    
    public Node(char var){
        this.val =var;
        this.adj=1;
    }
    
    public String toString(){
        return String.valueOf(val);
    }
}