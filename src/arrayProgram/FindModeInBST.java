package arrayProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class FindModeInBST {
    private Map<Integer, Integer> frequencyMap;
    private int maxFrequency;

    public int[] findMode(TreeNode root) {
        frequencyMap = new HashMap<>();
        maxFrequency = 0;

        traverse(root);

        List<Integer> modesList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                modesList.add(entry.getKey());
            }
        }

        int[] modesArray = new int[modesList.size()];
        for (int i = 0; i < modesList.size(); i++) {
            modesArray[i] = modesList.get(i);
        }

        return modesArray;
    }

    private void traverse(TreeNode node) {
        if (node == null) {
            return;
        }

        traverse(node.left);

        int frequency = frequencyMap.getOrDefault(node.val, 0) + 1;
        frequencyMap.put(node.val, frequency);
        maxFrequency = Math.max(maxFrequency, frequency);

        traverse(node.right);
    }

    public static void main(String[] args) {
        FindModeInBST solution = new FindModeInBST();

        // Example 1
        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(2);
        root1.right.left = new TreeNode(2);
        int[] result1 = solution.findMode(root1);
        for (int mode : result1) {
            System.out.print(mode + " ");  // Output: 2
        }
        System.out.println();

        // Example 2
        TreeNode root2 = new TreeNode(0);
        int[] result2 = solution.findMode(root2);
        for (int mode : result2) {
            System.out.print(mode + " ");  // Output: 0
        }
    }
}

