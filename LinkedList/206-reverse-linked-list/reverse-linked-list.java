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
 // solved
class Solution {
    public ListNode reverseList(ListNode head) {
        return rev(head, null);
    }

    public ListNode rev(ListNode curr, ListNode prev) {
        if (curr == null)
            return prev;
        ListNode currNext = curr.next;
        curr.next = prev;
        return rev(currNext, curr);
    }
}