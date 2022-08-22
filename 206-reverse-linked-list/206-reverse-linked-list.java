/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<Integer> valueStack = new Stack<Integer>();
	        
	    if(head==null){
            return head;
        }
        
        for(ListNode node = head; node !=null; node=node.next) {
	        	valueStack.push(node.val);
	        }
	        ListNode newHead = new ListNode();
	        
        
            if(valueStack.size()>0) {
	        	newHead.val=valueStack.pop();
	        }
        
	        for(int size = valueStack.size(); size>0;size--) {
	        	ListNode node = newHead;
	        	while(node.next!=null) {
	        		node=node.next;
	        	}
	        	node.next=new ListNode(valueStack.pop());
	        }
	        
			return newHead;
    }
}