package dsdefaultprograms;

public class Node {

  /** Linked List fields starts */
  public int data;
  public Node next, prev;

  /** Linked List fields Ends */

  /** Binary Search Tree fields starts */
  public Node left, right;
  public Integer key;

  public Node(Integer value, Boolean isBinarySearchTree) {
    this.key = value;
    if (isBinarySearchTree) {
      left = null;
      right = null;
    }

  }

  /** Binary Search Tree fields Ends */

  public Node() {

  }

}
