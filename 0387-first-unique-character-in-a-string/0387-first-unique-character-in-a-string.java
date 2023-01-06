class Solution {
public int firstUniqChar(String s) {
        int result = -1;
        HashMap<Character,Integer> countMap = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<s.length();i++){
            countMap.put(s.charAt(i),countMap.getOrDefault(s.charAt(i),0)+1);
            if(countMap.get(s.charAt(i))==1){
                q.add(i);
            }
        }
        
        while(!q.isEmpty()){
            int index = q.poll();
            if(countMap.get(s.charAt(index))==1){
                result = index;
                break;
            }
        }
        
        return result;
    }
};