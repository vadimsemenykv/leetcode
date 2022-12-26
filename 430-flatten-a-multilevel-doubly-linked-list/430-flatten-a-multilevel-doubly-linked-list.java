/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node current = head;
        Node last = null;
        boolean directionToRight = true;
        
        while (current != null) {
            if (current.child != null) {
                if (directionToRight) {
                    var tail = current.next;
                    current.next = current.child;
                    current.next.prev = current;
                    current.child = tail;
                } else {
                    last.next = current.child;
                    current.child = null;
                    last.next.prev = last;
                    directionToRight = true;
                }
            }
            
            if (current.next == null) {
                directionToRight = false;
                last = current;
            }
            
            if (directionToRight) {
                current = current.next;
            } else {
                current = current.prev;
            }    
        }
        
        return head;
    }
}