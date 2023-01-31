package dsdefaultprograms;

public class QueueUsingLinkedList {
    Node front = null, rear = null;

    void enqueue(int data) {
        var newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if (front == null && rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    void print() {
        Node tNode = front;
        while (tNode != null) {
            System.out.println(tNode.data);
            tNode = tNode.next;
        }
    }

    void deQueue() {
        if (front == null) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Dequeued Element = " + front.data);

            front = front.next;

            if (front == null)
                rear = null;
        }
    }

    public static void main(String[] args) {
        QueueUsingLinkedList usingLinkedList = new QueueUsingLinkedList();
        usingLinkedList.deQueue();

        usingLinkedList.enqueue(10);
        usingLinkedList.enqueue(20);
        usingLinkedList.enqueue(30);

        usingLinkedList.print();

        usingLinkedList.deQueue();
        usingLinkedList.deQueue();
        usingLinkedList.deQueue();
    }
}
