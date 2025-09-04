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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dHead = new ListNode();
        dHead.next = head;
        ListNode dummy = dHead;
        ListNode first = head;
        ListNode second = head.next;
        while(second != null){
            ListNode temp = second.next;
            dummy.next = second;
            second.next = first;
            first.next = temp;
            dummy = first;
            first = first.next;
            if(first == null) break;
            second = first.next;
        }
        return dHead.next;
    }
}