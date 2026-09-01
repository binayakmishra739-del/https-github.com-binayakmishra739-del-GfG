/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        // code here
        Node first = head;
        Node second = head;
        
        for(int i =0; i<k; i++){
            if ( first == null){
                return -1;
            }
            first = first.next;
        }
        while (first != null){
            first = first.next;
            second = second.next;
        }
        return second.data;
    }
}