class MyQueue {
	Stack<Integer> stack; 
	
    public MyQueue() {
        stack = new Stack<>();
    }
    
    public void push(int x) {
  //      System.out.println(">>push");
        stack.push(x);
//        System.out.println(Arrays.toString(stack.toArray()));
    }
    
    public int pop() {
//        System.out.println(">>pop");
		int [] arr = new int[stack.size()-1];
    	int size = stack.size();
        
		for(int i=0;i<size-1;i++) {
			arr[i]=stack.pop();
		}
		
		int result = stack.pop();
		
		for(int i=size-2;i>=0;i--) {
			stack.push(arr[i]);
		}
	
    //     System.out.println(Arrays.toString(stack.toArray()));
        
    	return result;
    }
    
    public int peek() {
 //       System.out.println(">>peek");
    	int [] arr = new int[stack.size()];
        int size = stack.size();
		for(int i=0;i<size;i++) {
			arr[i]=stack.pop();
		}
		int result =arr[arr.length-1];
		
		for(int i=arr.length-1;i>=0;i--) {
			stack.push(arr[i]);
		}
	
        //System.out.println(Arrays.toString(stack.toArray()));
    	return result;
    }
    
    public boolean empty() {
    	if(stack.empty())	return true;
    	else return false;
    }
}