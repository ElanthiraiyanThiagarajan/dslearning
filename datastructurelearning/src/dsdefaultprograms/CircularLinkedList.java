package dsdefaultprograms;

public class CircularLinkedList {

    public void defaultLogic() {
        var head = new Node();
        var middle = new Node();
        var last = new Node();
        head.data = 100;
        middle.data = 200;
        last.data = 300;

        head.next = middle;
        middle.next = last;
        last.next = head;

        Node tNode = head;
        do {
            System.out.println(tNode.data);
            tNode = tNode.next;
        } while (tNode != head);

    }

    Node head;

    public void addFirst(final int val) {
        Node newNode = new Node();
        newNode.data = val;

        if (head == null) {
            head = newNode;
            head.next = newNode;
        } else {
            Node lNode = head;
            while (lNode.next != head) {
                lNode = lNode.next;
            }
            lNode.next = newNode;
            newNode.next = head;
            head = newNode;
        }

    }

    public void addLast(final int val) {
        Node newNode = new Node();
        newNode.data = val;
        if (head == null) {
            head = newNode;
            head.next = newNode;
        } else {
            Node lNode = head;
            while (lNode.next != head) {
                lNode = lNode.next;
            }
            lNode.next = newNode;
            newNode.next = head;

        }
    }

    public boolean search(int key)
    {
        if(head == null)
            return false;

        Node temp = head;

        do
        {
            if(temp.data == key)
                return true;
            temp = temp.next;

        }while(temp != head);

        return false;
    }

    public void delete(final int key) {
        if (head == null) {
            System.out.println("There is no data");
        }

        if (head.data == key && head.next == head) {
            head = null;
        } else if (head.data == key) {
            Node lNode = head;
            while (lNode.next != head) {
                lNode = lNode.next;
            }

            lNode.next = head.next;
            head = head.next;
        } else {
            Node lNode = head;
            while (lNode.next != head) {
                if (lNode.next.data == key) {
                    lNode.next = lNode.next.next;
                    break;
                }
                lNode = lNode.next;
            }

            lNode.next = head.next;
            head = head.next;
        }
    }

    public void print() {
        if (head == null) {
            return;
        }

        Node tNode = head;
        do {
            System.out.println(tNode.data);
            tNode = tNode.next;
        } while (tNode != head);
    }

    public static void main(String[] args) {
        var circularLinkedList = new CircularLinkedList();
        circularLinkedList.addLast(100);
        circularLinkedList.addLast(200);
        circularLinkedList.addLast(300);
        System.out.println(circularLinkedList.search(300));
        circularLinkedList.delete(200);
        circularLinkedList.print();
    }
}