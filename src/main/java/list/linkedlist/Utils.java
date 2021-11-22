package list.linkedlist;

public class Utils {
    public static int countListNodeLength(ListNode node) {
        int length = 1;
        System.out.println("node = " + node.val);

        while(node.next != null) {
            length++;
            node = node.next;
            System.out.println("node = " + node.val);
        }

        return length;
    }

    public static int countNodeLength(Node node) {
        int length = 1;
//        System.out.println("node = " + node);
        System.out.println("node.val = " + node.val);
//        System.out.println("node.random = " + node.random);
        System.out.println("node.next = " + node.next);
        System.out.println();

        while(node.next != null) {
            length++;
            node = node.next;
//            System.out.println("node = " + node);
            System.out.println("node.val = " + node.val);
//            System.out.println("node.random = " + node.random);
//            System.out.println("node.random.val = " + node.random.val);
            System.out.println("node.next = " + node.next);
            System.out.println();
        }

        return length;
    }
}
