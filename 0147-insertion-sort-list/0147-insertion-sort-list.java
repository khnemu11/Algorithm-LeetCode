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
    public ListNode insertionSortList(ListNode head) {
        ListNode sorted= new ListNode(head.val);
        ListNode target = head.next;
        
        while(target!=null){
            ListNode curr = sorted;
            ListNode before = null;
            while(curr!=null){
                if(curr.val>target.val){
                    break;
                }
                before = curr;
                curr=curr.next;
            }
            ListNode input = new ListNode(target.val);
            input.next = curr;
            if(before==null){
                input.next = curr;
                sorted = input;
            }
            else{
                before.next = input;    
            }
            
            target=target.next;
        }
        
        return sorted;
    }
}