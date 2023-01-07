class Solution {
    public int findLucky(int[] arr) {
        int lucky = -1;
        
        int visited[] = new int[501];
        
        PriorityQueue<Integer> luckyQueue = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<arr.length;i++){
            visited[arr[i]]++;
            
            if(visited[arr[i]] == arr[i]){
                luckyQueue.add(arr[i]);
            }
        }
        
        while(!luckyQueue.isEmpty()){
            int curr = luckyQueue.poll();
            
            if(curr == visited[curr]){
                lucky = curr;
                break;
            }
        }
        
        return lucky;
    }
}