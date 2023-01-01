class KthLargest {
    List<Integer> list = new LinkedList<>();
    int seq = 0;
    
    public KthLargest(int k, int[] nums) {
        list.addAll(Arrays.asList(Arrays.stream(nums).mapToObj(x -> Integer.valueOf(x)).toArray(Integer[]::new)));
        Collections.sort(list,Collections.reverseOrder());
        seq = k;
    }
    
    public int add(int val) {
        list.add(val);

        if(list.get(seq-1) <= val){
            Collections.sort(list,Collections.reverseOrder());
        }

        
        return list.get(seq-1);
    }
}
