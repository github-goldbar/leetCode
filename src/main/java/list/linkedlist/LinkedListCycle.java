package list.linkedlist;

import java.util.HashSet;

public class LinkedListCycle {
  public static void main(String[] args) {
//    Example 1:
//
//    Input: head = [3,2,0,-4], pos = 1
//    Output: true
//    Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

//    Example 2:
//
//    Input: head = [1,2], pos = 0
//    Output: true
//    Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.

//    Example 3:
//
//    Input: head = [1], pos = -1
//    Output: false
//    Explanation: There is no cycle in the linked list.





//    Constraints:
//
//    The number of the nodes in the list is in the range [0, 10^4].
//    -10^5 <= Node.val <= 10^5
//    pos is -1 or a valid index in the linked-list.
//
//    Follow up: Can you solve it using O(1) (i.e. constant) memory?

  }

  public boolean hasCycle(ListNode head) {
    if (head == null) {
      return false;
    }

    ListNode slowRunner = head;
    ListNode fastRunner = head;


    while (fastRunner.next != null && fastRunner.next.next != null) {
      slowRunner = slowRunner.next;
      fastRunner = fastRunner.next.next;

      if(slowRunner == fastRunner) {
        return true;
      }
    }

    return false;
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


}


// Definition for singly-linked list.
class ListNode {
  int val;
  ListNode next;
  ListNode(int x) {
    val = x;
    next = null;
  }

//  public String toString() {
//    String result = "";
//    //  if (head == null)
//    //    return result;
//
//    ListNode node = head;
//    while (node != null) {
//
//      if (result == "")
//        result += node.value;
//      else
//        result += "->" + node.value;
//      node = node.next;
//
//    }
//    return result;
//  }
}

