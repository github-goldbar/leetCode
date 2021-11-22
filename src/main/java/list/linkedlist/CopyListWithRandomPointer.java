package list.linkedlist;

public class CopyListWithRandomPointer {
    public static void main(String[] args) {
//        [[7,null],[13,0],[11,4],[10,2],[1,0]]

        Node newNode = new Node(7);
        Node head = newNode;

        newNode.next = new Node(13);
        newNode = newNode.next;

        newNode.next = new Node(11);
        newNode = newNode.next;

        newNode.next = new Node(10);
        newNode = newNode.next;

        newNode.next = new Node(1);

        newNode = head;

        newNode = newNode.next;
        newNode.random = head.returnNode(head, 0);

        newNode = newNode.next;
        newNode.random = head.returnNode(head, 4);

        newNode = newNode.next;
        newNode.random = head.returnNode(head, 2);

        newNode = newNode.next;
        newNode.random = head.returnNode(head, 0);


        System.out.println("head before");
        Utils.countNodeLength(head);
        System.out.println();

        Node returnNode = copyRandomList(head);
//        System.out.println("returnNode");
//        Utils.countNodeLength(returnNode);
//        System.out.println();

        System.out.println("head after");
        Utils.countNodeLength(head);
        System.out.println();
    }

    public static Node copyRandomList(Node head) {

//        if (head == null) {
//            return null;
//        }

        Node fakeHead = new Node(0);
        fakeHead.next = head;

        while (head != null) {
            Node newNode = new Node(head.val);

            newNode.next = head.next;
            head.next = newNode;

            head = head.next;
            head = head.next;
        }

        head = fakeHead.next;

        while (head != null) {
            if (head.random != null) {
                head.next.random = head.random.next;
            }

            head = head.next;
            head = head.next;
        }

        head = fakeHead.next;

        Node evenHead = head.next;
        Node evenFakeHead = evenHead;

//        fakeHead.next = head.next;
//        head = head.next;

        while (head != null) {
            head.next = head.next.next;
            evenHead.next = (evenHead.next != null) ? evenHead.next.next : evenHead.next;

            head = head.next;
            evenHead = evenHead.next;
        }

        return evenFakeHead;
    }
}
