package dsdefaultprograms;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StackLinkedList {

    Node head = null;

    void push(int val) {
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = head;
        head = newNode;
    }

    void pop() {
        if (head == null) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Popped element = " + head.data);
            head = head.next;
        }
    }

    void print() {
        Node tNode = head;
        while (tNode != null) {
            System.out.println(tNode.data);
            tNode = tNode.next;
        }
    }

    public static final void main(String[] args) {
        StackLinkedList stackLinkedList = new StackLinkedList();
        stackLinkedList.pop();

        stackLinkedList.push(10);
        stackLinkedList.push(20);
        stackLinkedList.print();

        stackLinkedList.pop();
        stackLinkedList.print();

    }

}