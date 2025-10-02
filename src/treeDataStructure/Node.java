package treeDataStructure;

//class Node { ... } → Defines a blueprint for each tree node.
//
//int data; → Stores the value inside the node (e.g., 1, 2, 3).
//
//Node left, right; → References (pointers) to the left child and right child nodes.
//
//Node(int data) { this.data = data; } → A constructor that initializes the data field with the
// given value when creating a new node.
public class Node {

    int data;

    Node left , right;

    public Node(int data) {
        this.data = data;
    }
}
