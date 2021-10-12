package list.linkedlist;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;


/**
 * Initialize your data structure here.
 */
class MyLinkedList {
    static class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }
    }

    private int length;
    Node head;
    Node tail;

    public MyLinkedList() {
        head = new Node(0);
        tail = new Node(0);
        head.next = tail;
        tail.prev = head;
    }

    /**
     * Get the index-th node in the linked list. If the index is invalid, return -1.
     */
    public Node getNode(int index) {
        System.out.println("method getNode");
        if (index < 0 || index > length) {
            return null;
        }

        Node current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        System.out.println("method get");

        Node current = getNode(index);

        if (current == null) {
            return -1;
        }

        return current.value;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        System.out.println("method addAtHead");
        addAtIndex(0, val);
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        System.out.println("method addAtTail");
        addAtIndex(length, val);
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        System.out.println("method addAtIndex");
        if (index > length) {
            return;
        }

        Node current = new Node(val);

        // add at head
        if (index <= 0) {
            current.next = getNode(index);
            head = current;
        }

        // add at index
        else if (index < length) {
            Node indexNode = getNode(index - 1);

            current.next = indexNode.next;
            current.next.prev = current;
            indexNode.next = current;
            current.prev = indexNode;

        }

        // add at tail
        else if (index == length) {
            getNode(length - 1).next = current;
        }

        length++;
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        System.out.println("method deleteAtIndex");

        if (index < 0 || index >= length) {
            return;
        }

        // delete at head
        if (index <= 0) {
            head = getNode(1);
        }

        // delete at index
        else if (index < length) {
            Node indexNode = getNode(index);

            indexNode.prev.next = indexNode.next;
            indexNode.next.prev = indexNode.prev;
        }

        // delete at tail
        else if (index == length) {
            getNode(length - 1).next = null;
        }

        length--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */


public class DesignLinkedList {
    public static void main(String[] args) {
        //    String[] methodArray = {"MyLinkedList"};
        String[] methodArray = {"MyLinkedList", "addAtHead", "addAtTail", "addAtIndex", "get", "deleteAtIndex", "get"};
        //    int[][] valueArray = {{}};
        int[][] valueArray = {{}, {1}, {3}, {1, 2}, {1}, {1}, {1}};
        convertArrayToMethodAndCallIt(methodArray, valueArray);
    }

    static void convertArrayToMethodAndCallIt(String[] methodArray, int[][] valueArray) {
        Method method;

        Object[] result = new Object[methodArray.length];

        try {
            Object obj = new MyLinkedList();
            //      Class<?> myLinkedList = Class.forName("MyLinkedList");
            Class<?> clazz = obj.getClass();
            if (methodArray.length == valueArray.length) {
                for (int i = 1; i < methodArray.length; i++) {

                    if (methodArray[i].equals("MyLinkedList")) {
                        //            method = obj.getClass().getMethod(methodArray[i]);
                        method = clazz.getDeclaredMethod(methodArray[i]);
                        result[i] = method.invoke(obj);
                    } else if (methodArray[i].equals("addAtIndex")) {
                        method = clazz.getDeclaredMethod(methodArray[i], int.class, int.class);
                        result[i] = method.invoke(obj, valueArray[i][0], valueArray[i][1]);
                    } else {
                        System.out.println("method = " + methodArray[i]);
                        method = clazz.getDeclaredMethod(methodArray[i], int.class);
                        result[i] = method.invoke(obj, valueArray[i][0]);
                    }

                }
            }

            System.out.println(Arrays.toString(result));

        } catch (SecurityException e) {
            System.err.println("SecurityException");
        } catch (NoSuchMethodException e) {
            System.err.println("NoSuchMethodException");
        } catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException");
        } catch (IllegalAccessException e) {
            System.err.println("IllegalAccessException");
        } catch (InvocationTargetException e) {
            System.err.println("InvocationTargetException");
        }

    }
}


