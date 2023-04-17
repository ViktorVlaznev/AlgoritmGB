package org.example;

public class SinglyLinkedList {
    Node head;
    Node tail;

    public class  Node{
        int value;
        Node next;
        Node prev;
    }

    public void  revert(){
        Node curNode = head;
        while (curNode != null){
            Node next = curNode.next;
            Node prev = curNode.prev;
            curNode.next = prev;
            curNode.prev = next;
            if (prev == null){
                tail = curNode;
            }
            if (next == null){
                head = curNode;
            }
            curNode = next;
        }
    }
}
