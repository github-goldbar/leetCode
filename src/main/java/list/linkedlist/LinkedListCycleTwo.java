package list.linkedlist;

public class LinkedListCycleTwo {
    public static void main(String[] args) {

        //    Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

        //    There is a cycle in a linked list if there is some node in the list that can be reached again by continuously
        //    following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to.
        //    Note that pos is not passed as a parameter.

        //    Notice that you should not modify the linked list.

        //    Example 1:
        //
        //    Input: head = [3,2,0,-4], pos = 1
        //    Output: tail connects to node index 1
        //    Explanation: There is a cycle in the linked list, where tail connects to the second node.


        //    Example 2:
        //
        //    Input: head = [1,2], pos = 0
        //    Output: tail connects to node index 0
        //    Explanation: There is a cycle in the linked list, where tail connects to the first node.

        //    Example 3:
        //
        //    Input: head = [1], pos = -1
        //    Output: no cycle
        //    Explanation: There is no cycle in the linked list.

        ListNode node = new ListNode(3);
        ListNode head = node;
        node.next = new ListNode(2);
        node = node.next;
        node.next = new ListNode(0);
        node = node.next;
        node.next = new ListNode(-4);
        node = node.next;
        node.next = head.next;

        System.out.println(node.val);
        for (int i = 0; i < 10; i++) {
            System.out.println(node.next.val);
        }

        //    System.out.println(detectCycle(node));

        //    Constraints:
        //
        //    The number of the nodes in the list is in the range [0, 10^4].
        //    -10^5 <= Node.val <= 10^5
        //    pos is -1 or a valid index in the linked-list.
        //
        //    Follow up: Can you solve it using O(1) (i.e. constant) memory?

    }

    static public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode slowRunner = head;
        ListNode fastRunner = head;

        while (fastRunner.next != null && fastRunner.next.next != null) {
            slowRunner = slowRunner.next;
            fastRunner = fastRunner.next.next;

            if (slowRunner == fastRunner) {
                while (head != fastRunner) {

                    head = head.next;
                    fastRunner = fastRunner.next;

                }
                return fastRunner;
            }
        }

        return null;
    }

    //  public boolean hasCycle(ListNode head) {
    //    HashSet<ListNode> hashSet = new HashSet<ListNode>();
    //
    //    while (head != null) {
    //      if (hashSet.contains(head)) {
    //        return true;
    //      }
    //
    //      hashSet.add(head);
    //      head = head.next;
    //    }
    //
    //    return false;
    //  }

    static public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
