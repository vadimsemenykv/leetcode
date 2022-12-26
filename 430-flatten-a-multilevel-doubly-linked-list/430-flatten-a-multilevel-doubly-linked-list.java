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
        Node current = head , childNode = null;

        while (current != null) {
            if (current.child != null) {
                childNode = current.child;
                
                while (childNode.next !=null) {
                    childNode = childNode.next ;
                }

                if (current.next !=null) { 
                    childNode.next = current.next; 
                    current.next.prev = childNode;
                }
                
                current.child.prev = current;
                current.next = current.child;
                current.child = null;
            }
            
            current = current.next;
        }
        return head ;
    }
}