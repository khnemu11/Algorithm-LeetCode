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
    public boolean isPalindrome(ListNode head) {
        ListNode curr = head;
        Deque<Integer> dq = new LinkedList<>();
        while(curr!=null){
            dq.addFirst(curr.val);
            
            curr = curr.next;
        }
        
        System.out.println(dq);
        
        boolean isValid=true;
            
        
        while(dq.size()>1){
            if(dq.pollFirst() != dq.pollLast()){
                isValid=false;
                break;
            }
        }
        
        return isValid;
    }
}