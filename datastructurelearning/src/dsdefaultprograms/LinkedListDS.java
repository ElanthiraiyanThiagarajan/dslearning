package dsdefaultprograms;

public class LinkedListDS {

    Node head;

    public void addFirst(int val) {
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = head;

        head = newNode;

    }

    public void addLast(int val) {
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = null;
        if (head == null) {
            head = newNode;
        } else {
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }

    }

    public void delete(int key) {
        if (head.data == key) {
            head = head.next;
        } else {
            Node tNode = head;
            while (tNode.next != null) {
                if (tNode.next.data == key) {
                    tNode.next = tNode.next.next;
                    break;
                } else {
                    tNode = tNode.next;
                }
            }
        }

    }

    public boolean search(int key) {
        // if(head.data==key){
        // return false;
        // }else{
        Node tNode = head;
        while (tNode != null) {
            if (tNode.data == key) {
                return true;
            }
            tNode = tNode.next;

        }
        // }
        return false;
    }

    public void print() {
        Node tNode = head;
        while (tNode != null) {
            System.out.println(tNode.data);
            tNode = tNode.next;
        }
    }

    public static void main(String[] args) {
        // Node head, middle, last;

        // head = new Node();
        // middle = new Node();
        // last = new Node();

        // head.data = 10;
        // middle.data = 20;
        // last.data = 30;

        // head.next = middle;
        // middle.next = last;
        // last.next = null;
        // Node tNode = head;
        // while (tNode != null) {
        // System.out.println(tNode.data);
        // tNode = tNode.next;
        // }
        // System.out.println("out");
        LinkedListDS list = new LinkedListDS();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.delete(30);
        System.out.println(list.search(20));
        list.print();

    }
}