package main;

import implementation.MyLinkedList;

public class MyMain {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addFirst(500);
        linkedList.traverse();
        System.out.println("size = " + linkedList.size());

        linkedList.addFirst(700);
        linkedList.addFirst(200);
        linkedList.traverse();
        System.out.println("size = " + linkedList.size());

        linkedList.addAfterGivenNode(200, 100);
        linkedList.traverse();
        System.out.println("size = " + linkedList.size());

        linkedList.addLast(800);
        linkedList.traverse();
        System.out.println("size = " + linkedList.size());

        linkedList.addLastWithoutUsingTail(900);
        linkedList.traverse();
        System.out.println("size = " + linkedList.size());

        linkedList.removeFirst();
        linkedList.traverse();
        System.out.println("size = " + linkedList.size());

        linkedList.removeLast();
        linkedList.traverse();
        System.out.println("size = " + linkedList.size());

        linkedList.removeGivenNode(900);
        linkedList.traverse();
        System.out.println("size = " + linkedList.size());

        linkedList.search(800);
        linkedList.search(900);
    }
}
