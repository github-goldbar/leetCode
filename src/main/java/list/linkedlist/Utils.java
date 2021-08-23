package list.linkedlist;

public class Utils {
    public static int countNodeLength(ListNode node) {
        int length = 1;
        System.out.println("node = " + node.val);

        while(node.next != null) {
            length++;
            node = node.next;
            System.out.println("node = " + node.val);
        }

        return length;
    }
}
