package dsdefaultprograms;

public class DoublyLinkedList {

    Node head;

    public void defaultLogic() {
        var head = new Node();
        var middle = new Node();
        var last = new Node();

        head.data = 10;
        middle.data = 20;
        last.data = 30;

        head.next = middle;
        head.prev = null;

        middle.next = last;
        middle.prev = head;

        last.next = null;
        last.prev = middle;

        Node tNode = head;

        System.out.println("Forward Traversal");
        while (tNode != null) {
            System.out.println(tNode.data);
            tNode = tNode.next;
        }

        tNode = last;

        System.out.println("Backward Traversal");
        while (tNode != null) {
            System.out.println(tNode.data);
            tNode = tNode.prev;
        }
    }

    public void addFirst(int val) {
        var newnode = new Node();
        newnode.data = val;

        if (head == null) {
            newnode.prev = null;
            newnode.next = null;
            head = newnode;
        } else {
            newnode.prev = null;
            newnode.next = head;
            head.prev = newnode;
            head = newnode;

        }
    }

    public void addLast(int val) {
        var newnode = new Node();
        newnode.data = val;

        if (head == null) {
            newnode.prev = null;
            newnode.next = null;
            head = newnode;
        } else {
            Node lastNode = head;

            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newnode;
            newnode.prev = lastNode;
            newnode.next = null;

        }
    }

    public boolean search(int key) {
        Node tNode = head;
        while (tNode != null) {
            if (tNode.data == key) {
                return true;
            }
            tNode = tNode.next;

        }
        return false;
    }

    public void print() {
        Node temp = head;
        Node last = null;

        System.out.println("Forward Traversal");
        while (temp != null) {
            System.out.println(temp.data);
            if (temp.next == null)
                last = temp;
            temp = temp.next;
        }

        System.out.println("Backward Traversal");
        temp = last;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }

    public void delete(int key)
    {
        if(head == null)
            return;

        Node temp = head;

        while(temp != null && temp.data != key)
        {
            temp = temp.next;
        }

        if(temp == null)
            System.out.println("Key Not Found");
        else if(temp == head)
        {
            head = head.next;
            head.prev = null;
        }
        else if(temp.next == null)
            temp.prev.next = null;
        else
        {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }

    public static void main(String[] args) {
        var doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addLast(10);
        doublyLinkedList.addLast(20);
        doublyLinkedList.addLast(30);
        System.out.println(doublyLinkedList.search(30));
        doublyLinkedList.delete(40);
        doublyLinkedList.print();
    }

}
