package list.linkedlist;


public class FlattenAMultilevelDoublyLinkedList {

    public static void main(String[] args) {
        System.out.println(flatten(null));
    }

    static Node returnedHead = null;


    public static Node flatten(Node head) {

//      Solution 1

//        if (head == null) {
//            return null;
//        }
//
//        if (returnedHead != null) {
//            returnedHead.next = head;
//            head.prev = returnedHead;
//        }
//
//        returnedHead = head;
//
//        Node tempNext = head.next;
//
//        flatten(head.child);
//        head.child = null;
//
//        flatten(tempNext);
//
//        return head;


//      Solution 2

//          if child exist go to child
//              call flatten() again & return whole linked list back
//          else go next


//      Solution 3

        Node curr = head;
        while (curr != null) {
            if (curr.child != null) {
                Node tail = findTail(curr.child);

                if (curr.next != null) {
                    curr.next.prev = tail;
                }
                tail.next = curr.next;

                curr.next = curr.child;
                curr.child.prev = curr;

                curr.child = null;
            }
            curr = curr.next;

        }
        return head;

    }

    public static Node findTail(Node child){
        while(child.next != null){
            child = child.next;
        }
        return child;
    }


}
