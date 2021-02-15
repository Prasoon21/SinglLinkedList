package myinterface;

import implementation.Node;

public interface MySinglyLinkedList {
    // insert at beginning
    //insert at head
    //add first
    void addFirst(int element);
    //insertAtEnd
    //insertAtTail
    //void addLast(int element);
    boolean isEmpty();// will give true if linked list is empty
    int size();// will give total no. of elements in linked list
    void addLast(int element);
    void addLastWithoutUsingTail(int element);
    void traverse();
    void addAfterGivenNode(int givenElement, int element);
    // void addBeforeGivenNode(int givenElement, int element);
    int removeFirst();
    int removeLast();
    int removeGivenNode(int givenElement);
    boolean search(int element);
    int first();
    int last();

}
