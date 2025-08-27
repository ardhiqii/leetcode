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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode newHead = new ListNode();
        ListNode newCurr = new ListNode();
        newHead.next = newCurr;
        newCurr.val = head.val;
        ListNode curr = head;
        while(curr != null){
            while(curr.val == newCurr.val){
                curr = curr.next;
                if(curr == null){
                    break;
                }
            }
            if(curr == null)break;
            newCurr.next = new ListNode(curr.val);
            newCurr = newCurr.next;
            curr = curr.next;
        }
        return newHead.next;
    }
}