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
        if (head == null || head.next == null) return head;
        
        ListNode reserved = head;
        ListNode curr = head;
        
        while (curr != null) {
            while (curr != null && curr.val == reserved.val) {
                curr = curr.next;
            }
            reserved.next = curr;
            reserved = curr;
        }
        return head;
    }
}
