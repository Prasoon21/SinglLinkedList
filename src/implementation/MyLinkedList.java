package implementation;

import myinterface.MySinglyLinkedList;

public class MyLinkedList implements MySinglyLinkedList {
    //head reference or start of linked list or reference of first node
    private Node head;
    //tail reference or end of linked list or reference of last node
    private Node tail;
    //store total no. of elements in linked list
    private int size;

    //constructor
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void addFirst(int element) {
        Node node = new Node(element);
        if (isEmpty()) {
            head = node;
            tail = node;
            size++;
        } else {
            node.setNext(head);
            head = node;
            size++;
        }
    }

    //traverse
    public void traverse() {
        if (!isEmpty()) {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.getData() + "-->");
                //updating temp value
                temp = temp.getNext();
            }
            System.out.println("Null");
        } else {
            System.out.println("Linked list empty");
        }
    }
}
