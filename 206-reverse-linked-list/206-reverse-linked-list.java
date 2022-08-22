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
        ListNode curr = head;
        ListNode prev = null;
        
        while(curr !=null){
            ListNode next = curr.next;
            //save previous node value in curr
            curr.next= prev;
            
            //next
            prev=curr;
            curr=next;
        }
        
        return prev;
    }
}