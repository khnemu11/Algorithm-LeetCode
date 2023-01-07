class Solution {
    public int secondHighest(String s) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                pq.add(s.charAt(i)-'0');
            }
        }
        if(pq.isEmpty()){
            return -1;
        }        
        
        int max = pq.poll();
        
        while(!pq.isEmpty()){
            if(max != pq.peek()){
                break;    
            }
            pq.poll();
        }
        
        if(pq.isEmpty()){
            return -1;
        }
            
         return pq.poll();   
    }
}