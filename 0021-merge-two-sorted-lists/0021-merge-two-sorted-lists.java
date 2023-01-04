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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        ListNode result = new ListNode();
        ListNode before = null;
        ListNode resultCurr = result;

        while(curr1 != null && curr2 != null){
            if(curr1.val > curr2.val){
                resultCurr.val = curr2.val;
                resultCurr.next = new ListNode();
                before = resultCurr;
                resultCurr = resultCurr.next;
                curr2 = curr2.next;
            }
            else{
                resultCurr.val =curr1.val;
                resultCurr.next = new ListNode();
                before = resultCurr;
                resultCurr = resultCurr.next;
                curr1 = curr1.next;
            }
        }
        
        if(curr1 !=null){
            while(curr1!=null){
                resultCurr.val =curr1.val;
                resultCurr.next = new ListNode();
                before = resultCurr;
                resultCurr = resultCurr.next;
                curr1 = curr1.next;
            }   
        }
        else if(curr2!=null){
               while(curr2!=null){
                resultCurr.val = curr2.val;
                resultCurr.next = new ListNode();
                before = resultCurr;
                resultCurr = resultCurr.next;
                curr2 = curr2.next;
            }   
        }
        if(before!=null){
            before.next = null;    
        }
        else{
            return before;
        }
        
        return result;
    }
}