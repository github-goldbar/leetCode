package list;

public class AddTwoNumbers {
  public static void main(String[] args) {

//    Example 1:
//    Input: l1 = [2,4,3], l2 = [5,6,4]
//    Output: [7,0,8]
//    Explanation: 342 + 465 = 807.

    ListNode listNodeQ1Third = new ListNode(3);
    ListNode listNodeQ1Second = new ListNode(4, listNodeQ1Third);
    ListNode listNodeQ1First = new ListNode(2, listNodeQ1Second);

    ListNode listNodeQ2Third = new ListNode(4);
    ListNode listNodeQ2Second = new ListNode(6, listNodeQ2Third);
    ListNode listNodeQ2First = new ListNode(5, listNodeQ2Second);

    ListNode listNodeOutputThird = new ListNode(8);
    ListNode listNodeOutputSecond = new ListNode(0, listNodeOutputThird);
    ListNode listNodeOutputFirst = new ListNode(7, listNodeOutputSecond);

   ListNode e1AnswerListNode = addTwoNumbers(listNodeQ1First, listNodeQ2First);
//
//    System.out.println("Example 1");
//
//    System.out.println("node 1 is " + (e1AnswerListNode.val == listNodeOutputFirst.val));
//    System.out.println("node 2 is " + (e1AnswerListNode.next.val == listNodeOutputFirst.next.val));
//    System.out.println("node 3 is " + (e1AnswerListNode.next.next.val == listNodeOutputFirst.next.next.val));

//    Example 2:
//
//    Input: l1 = [0], l2 = [0]
//    Output: [0]

    ListNode listNodeQ3First = new ListNode(0);
    ListNode listNodeQ4First = new ListNode(0);
    ListNode listNodeE2Output = new ListNode(0);

//    ListNode e2AnswerListNode = addTwoNumbers(listNodeQ3First, listNodeQ4First);

//    System.out.println("Example 2");
//
//    System.out.println("node 1 is " + (e2AnswerListNode.val == listNodeE2Output.val));

//    Example 3:
//
//    Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//    Output: [8,9,9,9,0,0,0,1]

    ListNode listNode1 = new ListNode(0);
    ListNode listNode2 = new ListNode(0);
    ListNode currentNode1 = listNode1;
    ListNode currentNode2 = listNode2;
    int[] l1 = new int[]{9, 9, 9, 9, 9, 9, 9}, l2 = new int[]{9, 9, 9, 9};

    for (int i = 0; i < l1.length; i++) {
      currentNode1.next = new ListNode(l1[i]);
      currentNode1 = currentNode1.next;
    }

    for (int i = 0; i < l2.length; i++) {
      currentNode2.next = new ListNode(l2[i]);
      currentNode2 = currentNode2.next;
    }

    ListNode e3AnswerListNode = addTwoNumbers(listNode1.next, listNode2.next);

    currentNode1 = e3AnswerListNode;
    while (currentNode1 != null) {
      System.out.println(currentNode1.val);
      currentNode1 = currentNode1.next;
    }

  }

  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int carry = 0, total;

    ListNode returnedNodeHead = new ListNode(0), currentNodeHead = returnedNodeHead;

    while (l1 != null || l2 != null) {

      total = carry;

      if (l1 != null) { total += l1.val; l1 = l1.next; }
      if (l2 != null) { total += l2.val; l2 = l2.next; }

      System.out.println("total = " + total);

      carry = total / 10;
      System.out.println("carry = " + carry);

      currentNodeHead = currentNodeHead.next = new ListNode(total % 10);
      System.out.println("currentNodeHead.val = " + currentNodeHead.val);


      System.out.println();
    }

    if (carry > 0) {
      currentNodeHead.next = new ListNode(carry);
    }

    return returnedNodeHead.next;
  }

}

class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode (int val) {
    this.val = val;
  }
  ListNode(int val, ListNode next) {
    this.val = val; this.next = next;
  }
}