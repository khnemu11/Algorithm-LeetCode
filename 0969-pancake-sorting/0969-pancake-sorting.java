class Solution {
    public List<Integer> pancakeSort(int[] arr) {        
        List<Integer> list = new ArrayList<>();
        Deque<Integer> queue = new LinkedList<>();
        for(int i=0;i<arr.length;i++){
           queue.add(arr[i]);
        }
        
        Arrays.sort(arr);

        for(int i=arr.length-1;i>=0;i--){
            if(queue.peekLast() == arr[i]){
                queue.pollLast();
                continue;
            }
            
            Queue<Integer> reverse = new LinkedList<>();
           
            int count =0;
            while(true){
                count++;
                
                if(queue.peekFirst()==arr[i]){
                    reverse.add(queue.pollFirst());
                    break;
                }
                else{
                    reverse.add(queue.pollFirst());
                }
            }
            list.add(count);
          
            while(!reverse.isEmpty()){
                queue.addFirst(reverse.poll());
            }
            
            for(int j=0;j<=i;j++){
                 reverse.add(queue.pollFirst());
            }
            while(!reverse.isEmpty()){
                queue.addFirst(reverse.poll());
            }
            list.add(i+1);
        }
        
        
        return list;
    }
}