package string;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class ConstructStringFromBinaryTree {

    public String treeToStr(TreeNode root) {
        if (root == null) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        result.append(root.val);

        String leftStr = treeToStr(root.left);
        String rightStr = treeToStr(root.right);

        if (!leftStr.isEmpty() || !rightStr.isEmpty()) {
            result.append("(").append(leftStr).append(")");
        }

        if (!rightStr.isEmpty()) {
            result.append("(").append(rightStr).append(")");
        }

        return result.toString();
    }

    public String tree2str(TreeNode root) {
        return treeToStr(root);
    }

    public static void main(String[] args) {
        ConstructStringFromBinaryTree solution = new ConstructStringFromBinaryTree();

        // Example 1
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        String result1 = solution.tree2str(root1);
        System.out.println(result1); // Output: "1(2(4))(3)"

        // Example 2
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.right = new TreeNode(4);
        String result2 = solution.tree2str(root2);
        System.out.println(result2); // Output: "1(2()(4))(3)"
    }
}
