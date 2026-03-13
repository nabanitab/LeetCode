package treeDataStructure;

class BST {
    class Node {
        int key;
        Node left, right;
        Node(int key) { this.key = key; }
    }
    Node root;

    void insert(int key) { root = insertRec(root, key); }

    Node insertRec(Node root, int key) {
        if (root == null) return new Node(key);
        if (key < root.key) root.left = insertRec(root.left, key);
        else if (key > root.key) root.right = insertRec(root.right, key);
        return root;
    }


    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        tree.inorder(tree.root); // 20 30 40 50 60 70 80
    }
}

