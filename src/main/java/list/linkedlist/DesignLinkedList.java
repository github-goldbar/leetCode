package list.linkedlist;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;


/**
 * Initialize your data structure here.
 */
class MyLinkedList {
    int length;
    Node head;
    Node tail;

    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    public MyLinkedList() {
        head = null;
        tail = null;
        length = 0;
    }

    /**
     * Get the index-th node in the linked list. If the index is invalid, return -1.
     */
    public Node getNode(int index) {
//        System.out.println("method getNode");
        if (index >= length) {
            return null;
        }

        Node current = head;

        for (int i = 0; i <= index; i++) {
            current = current.next;
        }

        return current;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
//        System.out.println("method get");

        Node current = getNode(index);

        if (current == null) {
            return -1;
        }

        return current.value;
    }

    private void emptyAdd(int val) {
        head = new Node(val);
        tail = head;

        length++;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
//        System.out.println("method addAtHead");
        addAtIndex(0, val);
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
//        System.out.println("method addAtTail");
        addAtIndex(length, val);
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
//        System.out.println("method addAtIndex");

        if (length == 0) {
            emptyAdd(val);
            return;
        }

        Node current = new Node(val);

        // add at head
        if (index <= 0) {
            current.next = head;
            head.prev = current;
            head = current;
        }

        // add at index
        else if (index < length) {
            int i = 0;
            Node indexNode = head;

            while(indexNode != null) {
                // determine if we found the insert position
                if (i == index) {
                    // create the node to be inserted
                    Node node = new Node(val);

                    // rearrange the pointers
                    node.prev = indexNode.prev;
                    node.next = indexNode;
                    indexNode.prev = node;
                    node.prev.next = node;

                    length++;

                    break;
                }

                // increment
                i++;
                indexNode = indexNode.next;
            }

//            Node indexNode = getNode(index);
//
//            current.prev = indexNode.prev;
//            current.next = indexNode;
//            indexNode.prev = current;
//            current.next.prev = current;

        }

        // add at tail
        else if (index == length) {
            current.prev = tail;
            tail.next = current;
            tail = current;
        }

        length++;
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
//        System.out.println("method deleteAtIndex");

        if (index < 0 || index >= length) {
            return;
        }

        if (length == 1) {
            // nullify the list
            head = null;
            tail = null;

            length = 0;
        }

        // delete at head
        else if (index == 0) {
            head = head.next;
            head.prev = null;
        }

        // delete at tail
        else if (index == length - 1) {
            tail = tail.prev;
            tail.next = null;
        }

        // delete at index
        else {
            int i = 0;
            Node current = head;
//            Node indexNode = getNode(index);

            while(current != null) {
                if (i == index) {
                    current.next.prev = current.prev;
                    current.prev.next = current.next;

                    length--;

                    break;
                }

                current = current.next;
                i++;
            }
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


