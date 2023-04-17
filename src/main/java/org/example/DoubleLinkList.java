package org.example;

public class DoubleLinkList {
    Node head;
    public class  Node{
        int value;
        Node next;
    }
    public void revert(){
        if (head != null && head.next != null){
            Node temp = head;
            revert(head.next, head);
            temp.next = null;
        }
    }
    private void revert(Node curNode, Node prevNode){
        if (curNode.next == null){
            head = curNode;
        } else {
           revert(curNode.next, curNode);
        }
        curNode.next  = prevNode;
    }
}
