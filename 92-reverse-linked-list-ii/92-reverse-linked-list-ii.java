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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) return head;

        ListNode current = head;
        ListNode start = head;
        ListNode tail = head;
        ListNode newList = null;
        int position = 1;

        while (position < left) {
            start = current;
            current = current.next;
            tail = current;
            position++;
        }
        
        while (position <= right) {
            ListNode next = current.next;
            current.next = newList;
            newList = current;
            current = next;
            position++;
        }

        start.next = newList;
        tail.next = current;

        if (left > 1) {
            return head;
        } else {
            return newList;
        }
    }
}