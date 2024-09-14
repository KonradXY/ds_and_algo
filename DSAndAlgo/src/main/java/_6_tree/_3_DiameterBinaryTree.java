package _6_tree;

import _6_tree.dfs.TreeNode;

public class _3_DiameterBinaryTree {

    /**
     * Approach
     * Calculate height of a tree AND at the same method calculate current diameter of each node AND select MAX diameter.
     * <p>
     * Complexity
     * Time complexity:
     * O(n) as we touch every node, where n is the number of nodes in a tree.
     * <p>
     * Space complexity:
     * O(n) in the worst case when our tree is unbalanced. O(n) is required as we approach the problem recursively and use call stack.
     * In the best case - when a tree is balanced - it could be O(log n).
     */

    private int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return maxDiameter;
    }

    private int height(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHight = height(root.right);

        // we calculate the possible diameter of each node checking if it is bigger than the current maxDiameter
        maxDiameter = Math.max(maxDiameter, leftHeight + rightHight);

        // we return the height of the current node in order
        return Math.max(leftHeight, rightHight) + 1;
    }


}
