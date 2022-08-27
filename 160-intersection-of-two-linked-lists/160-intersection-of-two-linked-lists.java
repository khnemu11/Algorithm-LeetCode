class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	ListNode currA = headA;
    	ListNode currB = headB;
    	boolean endA=false;
        boolean endB=false;
    	while(true) {
    		if(currA != currB) {
    			if(currA.next == null && !endA) {
    				currA = headB;
                    endA=true;
    			}
                else if(currA.next == null && endA){
                    return null;
                }
    			else {
    				currA=currA.next;
    			}
                
    			if(currB.next == null  && !endB) {
    				currB = headA;
                    endB=true;
    			}
                else if(currB.next == null && endB){
                    return null;
                }
    			else {
    				currB=currB.next;
    			}
    		}
    		else {
    			return currA;
    		}
    	}
    }
}