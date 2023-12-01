package arrayProgram;

public class SortedArrayToBST {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = sortedArrayToBST(nums, start, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, end);

        return root;
    }

    // Helper method to print the tree (in-order traversal)
    private void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.val + " ");
            inOrderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        SortedArrayToBST solution = new SortedArrayToBST();

        int[] nums1 = {-10, -3, 0, 5, 9};
        TreeNode result1 = solution.sortedArrayToBST(nums1);
        solution.inOrderTraversal(result1);
        System.out.println();

        int[] nums2 = {1, 3};
        TreeNode result2 = solution.sortedArrayToBST(nums2);
        solution.inOrderTraversal(result2);
    }
}
