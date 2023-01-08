class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int sum = 0;
        PriorityQueue<Cost>pq = new PriorityQueue<>();
        
        for(int i=0;i<costs.length;i++){
            pq.add(new Cost(costs[i][0],costs[i][1]));
        }
        
        System.out.println(pq);
        int aCount = 0;
        int bCount = 0;
        
        while(!pq.isEmpty() && aCount < costs.length/2 && bCount < costs.length/2){
            Cost curr = pq.poll();
            
            if(curr.a < curr.b){
                sum+=curr.a;
                aCount++;
            }
            else{
                sum+=curr.b;
                bCount++;
            }
        }
        
        if(!pq.isEmpty()){
            if(aCount >=costs.length/2){
                while(!pq.isEmpty()){
                    sum+= pq.poll().b;
                }
            }    
            else{
                while(!pq.isEmpty()){
                    sum+= pq.poll().a;
                }
            }
        }        
        
        return sum;
        
    }
    
}
class Cost implements Comparable<Cost>{
    int a;
    int b;
    
    public Cost(int a, int b){
        this.a =a;
        this.b=b;
    }
    
    @Override
    public int compareTo(Cost o){
        return Math.abs(o.a-o.b) - Math.abs(this.a-this.b);
    }
    
    public String toString(){
        return "a : "+this.a+" b: "+this.b;
    }
}