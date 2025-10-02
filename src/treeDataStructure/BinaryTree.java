package treeDataStructure;

public class BinaryTree {


    Node root;

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        System.out.println("Root: " + tree.root.data); // 1
    }
}
