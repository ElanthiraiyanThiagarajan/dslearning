package dsdefaultprograms;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    Node root;

    private Node insert(Node root, Integer value) {
        if (root == null) {
            return new Node(value, true);
        } else if (value > root.key) {
            root.right = insert(root.right, value);
            return root;
        } else {
            root.left = insert(root.left, value);
            return root;
        }
    }

    void insert(Integer value) {
        root = insert(root, value);
    }

    public void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.key + " ");
        inOrder(root.right);

    }

    public void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.key + " ");

        inOrder(root.left);
        inOrder(root.right);

    }

    public void postOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        inOrder(root.right);
        System.out.print(root.key + " ");
    }

    void levelOrder() {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node presentNode = queue.remove();
            System.out.print(presentNode.key + " ");
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
    }

    Node search(Node root, int value) {
        if (root == null) {
            System.out.println("Given Value is not available");
            return root;
        } else if (value == root.key) {
            System.out.println(value);
            return root;
        } else if (value > root.key) {
            return search(root.right, value);
        } else {
            return search(root.left, value);
        }
    }

    // Minimum node
    public static Node minimumNode(Node root) {
        if (root.left == null) {
            return root;
        } else {
            return minimumNode(root.left);
        }
    }

    public Node deleteNode(Node root, int key) {
        if (root == null) {
            System.out.println("Value not found in BST");
            return null;
        }

        if (key < root.key) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.key) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left != null && root.right != null) {
                Node temp = root;
                Node minNodeForRight = minimumNode(temp.right);
                root.key = minNodeForRight.key;
                root.right = deleteNode(root.right, minNodeForRight.key);
            } else if (root.left != null) {
                root = root.left;
            } else if (root.right != null) {
                root = root.right;
            } else {
                root = null;
            }

        }
        return root;

    }

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(100);
        binarySearchTree.insert(50);
        binarySearchTree.insert(75);

        binarySearchTree.insert(25);
        binarySearchTree.insert(100);

        binarySearchTree.insert(150);

        binarySearchTree.insert(125);

        System.out.println("Inorder Traversal of Above BST");
        binarySearchTree.inOrder(binarySearchTree.root);
        System.out.println();
        System.out.println("Preorder Traversal of Above BST");

        binarySearchTree.deleteNode(binarySearchTree.root, 100);
        // binarySearchTree.search(binarySearchTree.root, 125);
        System.out.println(binarySearchTree.root.key);
        binarySearchTree.inOrder(binarySearchTree.root);

    }

}
