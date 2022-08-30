class Solution {
    public int getImportance(List<Employee> employees, int id) {
    	HashMap<Integer,Employee> employeesById = new HashMap<>();
    	int sum=0;
    	for(Employee element : employees) {
    		employeesById.put(element.id, element);
    	}
    	
    	Stack<Employee> next = new Stack<>();
    	
    	next.push(employeesById.get(id));
    	
    	while(!next.isEmpty()) {
    		Employee curr = next.pop();
    		
    		sum+=curr.importance;
    		
    		if(!curr.subordinates.isEmpty()){
    			for(int i=0;i<curr.subordinates.size();i++) {
    				next.push(employeesById.get(curr.subordinates.get(i)));
    			}
    		}
    	}
    	System.out.println(sum);
    	
    	return sum;
    }
}