/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        boolean visited[] = new boolean[200001];
        Set<ListNode> listSet = new HashSet<>();
        ListNode curr = head;
        
        while(curr!=null){
            int size = listSet.size();
            listSet.add(curr);
            if(size == listSet.size()){
                return true;
            }
            
            curr = curr.next;
        }
        
        return false;
    }
}

