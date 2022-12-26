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
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        
        var current = head;
        Set<ListNode> checkedNodes = new HashSet();

        
        while (!checkedNodes.contains(current) && current != null) {
            checkedNodes.add(current);
            current = current.next;
        }
        
        return current;
    }
}