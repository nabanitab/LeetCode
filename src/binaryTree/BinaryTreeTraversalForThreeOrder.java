package binaryTree;

// Class to represent a single tree node
class TreeNodes {
    int value;
    TreeNodes leftChild;
    TreeNodes rightChild;

    public TreeNodes(int value) {
        this.value = value;
        leftChild = rightChild = null;
    }
}

public class BinaryTreeTraversalForThreeOrder {

    // Root node of the binary tree
    private TreeNodes root;

    // Perform Inorder Traversal (Left -> Root -> Right)
    public void performInorderTraversal(TreeNodes currentNode) {
        if (currentNode != null) {
            performInorderTraversal(currentNode.leftChild);
            System.out.print(currentNode.value + " ");
            performInorderTraversal(currentNode.rightChild);
        }
    }

    // Perform Preorder Traversal (Root -> Left -> Right)
    public void performPreorderTraversal(TreeNodes currentNode) {
        if (currentNode != null) {
            System.out.print(currentNode.value + " ");
            performPreorderTraversal(currentNode.leftChild);
            performPreorderTraversal(currentNode.rightChild);
        }
    }

    // Perform Postorder Traversal (Left -> Right -> Root)
    public void performPostorderTraversal(TreeNodes currentNode) {
        if (currentNode != null) {
            performPostorderTraversal(currentNode.leftChild);
            performPostorderTraversal(currentNode.rightChild);
            System.out.print(currentNode.value + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTreeTraversalForThreeOrder binaryTree = new BinaryTreeTraversalForThreeOrder();

        // Build the sample binary tree
        /*
                 10
                /  \
               20   30
              / \
             40  50
         */
        binaryTree.root = new TreeNodes(10);
        binaryTree.root.leftChild = new TreeNodes(20);
        binaryTree.root.rightChild = new TreeNodes(30);
        binaryTree.root.leftChild.leftChild = new TreeNodes(40);
        binaryTree.root.leftChild.rightChild = new TreeNodes(50);

        System.out.println("Inorder Traversal (Left -> Root -> Right):");
        binaryTree.performInorderTraversal(binaryTree.root);

        System.out.println("\nPreorder Traversal (Root -> Left -> Right):");
        binaryTree.performPreorderTraversal(binaryTree.root);

        System.out.println("\nPostorder Traversal (Left -> Right -> Root):");
        binaryTree.performPostorderTraversal(binaryTree.root);
    }
}

