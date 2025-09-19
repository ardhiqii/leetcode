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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < lists.length; i++){
            ListNode curr = lists[i];
            while(curr != null){
                pq.add(curr.val);
                curr = curr.next;
            }
        }
        if(pq.peek() == null) return null;
        ListNode head = new ListNode();
        ListNode curr = head;
        while(pq.peek() != null){
            ListNode newVal = new ListNode(pq.poll());
            curr.next = newVal;
            curr = curr.next;
        }
        return head.next;
    }
}