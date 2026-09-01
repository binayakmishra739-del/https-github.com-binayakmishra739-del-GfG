/* Structure of linked list Node
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}*/

class myStack {
    private Node top;
    private int count;

    public myStack() {
        top = null;
        count = 0;
    }

    public boolean isEmpty() {
        return top == null;
        // check if the stack is empty
    }

    public void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
        count++;
        // Adds an element x at the rear of the stack.
    }

    public void pop() {
        if ( top == null){
            return;
        }
        top = top.next;
        count--;
        // Removes the front element of the stack.
    }

    public int peek() {
        if ( top == null){
            return -1;
        }
        return top.data;
        // Returns the front element of the stack.
        // If stack is empty, return -1.
    }

    public int size() {
        return count;
        // Returns the current size of the stack.
    }
}
