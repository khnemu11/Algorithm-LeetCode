class Solution {
    boolean visited[];
    public String decodeString(String s) {
        visited = new boolean[s.length()];
        String result = recurr(0,s);
        
        return result;
    }
    
    public String recurr(int curr,String s){
        StringBuilder sb = new StringBuilder();
        int idx = curr;
        int loop = 0;
        while(idx<s.length()){
            if(visited[idx]){
                 idx++;
                continue;
            }
            visited[idx]=true;
            
            if(Character.isDigit(s.charAt(idx))){
                loop =(s.charAt(idx)-'0')+loop*10;
            }
            else if(s.charAt(idx)=='['){
                String word = recurr(idx+1,s);
                
                for(int i=0;i<loop;i++){
                    sb.append(word);
                }

                System.out.println(idx);
                loop=0;
            }
            else if(s.charAt(idx)==']'){
                return sb.toString();
            }
            else{
                sb.append(s.charAt(idx));
                
            }
            idx++;
        }
        
        return sb.toString();
    }
}