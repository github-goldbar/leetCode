package list.linkedlist;

public class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    public Node returnNode(Node head, int val) {

//        if (val == null) {
//            return null;
//        }

        for (int i = 0; i < val; i++) {
            head = head.next;
        }

        return head;
    }
}
