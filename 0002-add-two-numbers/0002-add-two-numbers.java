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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int extra = 0;
        String raw = "";
        ListNode currNode = new ListNode();
        ListNode result = currNode;
        while(l1 != null || l2 != null){
            int sum = 0;
            if(l1 != null && l2 != null ){
                sum = l1.val + l2.val;
                l1 = l1.next;
                l2 = l2.next;
            }else if(l1 != null){
                sum = l1.val;
                l1 = l1.next;
            }else if(l2 != null){
                sum = l2.val;
                l2 = l2.next;
            }
            if(extra != 0){
                sum += extra;
                extra = 0;
            }
            if(sum > 9){
                extra = 1;
                sum = sum % 10;
            }
            ListNode node = new ListNode(sum);
            currNode.next = node;
            currNode = node;
        }
        if(extra != 0){
            ListNode node = new ListNode(extra);
            currNode.next = node;
        }
        return result.next;

    }
}