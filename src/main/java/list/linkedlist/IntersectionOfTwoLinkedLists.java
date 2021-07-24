package list.linkedlist;

public class IntersectionOfTwoLinkedLists {

    public static void main(String[] args) {

        //    Constraints:

        //    The number of nodes of listA is in the m.
        //    The number of nodes of listB is in the n.
        //    0 <= m, n <= 3 * 10^4
        //    1 <= Node.val <= 10^5
        //    0 <= skipA <= m
        //    0 <= skipB <= n
        //    intersectVal is 0 if listA and listB do not intersect.
        //    intersectVal == listA[skipA + 1] == listB[skipB + 1] if listA and listB intersect.
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode aRunner = headA;
        ListNode bRunner = headB;

        while (aRunner.next != null || bRunner.next != null) {

            if (aRunner.next != null) {
                aRunner = aRunner.next;

                if (checkIfTwoNodeEquals(aRunner, bRunner)) {
                    return aRunner;
                }
            }


            if (aRunner.next != null) {
                bRunner = bRunner.next;

                if (checkIfTwoNodeEquals(aRunner, bRunner)) {
                    return bRunner;
                }
            }
        }

        return null;
    }

    static boolean checkIfTwoNodeEquals(ListNode nodeA, ListNode nodeB) {
        return nodeA == nodeB;
    }

    static public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
