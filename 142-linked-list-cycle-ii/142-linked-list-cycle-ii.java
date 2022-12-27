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
        var tortoise = head;
        var hare = head;
        boolean met = false;
        
        while (!met && hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;
            
            if (tortoise.equals(hare)) {
                met = true;
            }
        }
        
        if (!met) {
            return null;
        }
        
        var p1 = head;
        var p2 = tortoise;
        
        while (!p1.equals(p2)) {
            p1 = p1.next;
            p2 = p2.next;
        }
        
        return p1;
    }
}