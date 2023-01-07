class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map = new HashMap<>();
        
        String words[] = s1.split(" ");
        
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        
        words = s2.split(" ");
        
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        
        ArrayList<String> list = new ArrayList<>();
        
        for(String key : map.keySet()){
            if(map.get(key)==1){
                list.add(key);
            }
        }
        
        String[] result = list.toArray(new String[list.size()]);
        
        return result;
    }
}