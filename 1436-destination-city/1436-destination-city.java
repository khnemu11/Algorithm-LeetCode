class Solution {
    public String destCity(List<List<String>> paths) {
    
        String curr = paths.get(0).get(1);
        
        Queue<Integer> rest = new LinkedList<>();
        
        for(int i=1;i<paths.size();i++){
            rest.add(i);
        }
        
        while(!rest.isEmpty()){
            String next = curr;
            int loop = rest.size();
            
            while(loop-->0){
                int index = rest.poll();
                
                if(paths.get(index).get(0).equals(curr)){
                    next = paths.get(index).get(1);
                    break;
                }
                
                rest.add(index);
            }
            
            if(next.equals(curr)){
                break;
            }
            
            curr = next;
        }
        
        return curr;
    }
}