class Solution {
    public int distributeCandies(int[] candyType) {
        int max = candyType.length/2;
        
        Set<Integer> typeSet = new HashSet<>();
        
        for(int i=0;i<candyType.length;i++){
            typeSet.add(candyType[i]);
        }
        
        max = Math.min(max,typeSet.size());
        
        return max;
    }
}