package dsdefaultprograms;


public class BinaryTree {
    static void preOrder(Node tNode) {
        if (tNode == null)
            return;

        System.out.print(tNode.key + " ");
        preOrder(tNode.left);
        preOrder(tNode.right);

    }

    static void inOrder(Node tNode) {
        if (tNode == null)
            return;

        inOrder(tNode.left);
        System.out.print(tNode.key + " ");
        inOrder(tNode.right);

    }

    static void postOrder(Node tNode) {
        if (tNode == null)
            return;

        postOrder(tNode.left);
        postOrder(tNode.right);
        System.out.print(tNode.key + " ");
    }

    public static void main(String[] args) {
        Node rNode = new Node(1, false);
        
        rNode.left = new Node(2, false);
        rNode.right = new Node(3, false);

        rNode.left.left = new Node(4, false);
        rNode.left.right = new Node(5, false);

        rNode.right.left = new Node(6, false);
        rNode.right.right = new Node(7, false);

        preOrder(rNode);

        System.out.println();

        inOrder(rNode);

        System.out.println();

        postOrder(rNode);

        System.out.println();
    }
}
