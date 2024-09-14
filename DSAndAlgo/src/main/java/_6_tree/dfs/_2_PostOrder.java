package _6_tree.dfs;

import java.util.ArrayDeque;
import java.util.Deque;

public class _2_PostOrder {

    /**
     * Finally, in postorder traversal, we traverse the left and right subtree before we traverse the root.
     * We can follow our previous recursive solution:
     */

    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        root.visit();
    }


    /**
     * Or, we can also implement postorder traversal without recursion:
     * <p>
     * Push root node in stack
     * While stack is not empty
     * Check if we already traversed left and right subtree
     * If not then push right child and left child onto stack
     */

    public void postOrderWithoutRecursion(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode prev = root;
        TreeNode current;
        stack.push(root);

        while (!stack.isEmpty()) {
            current = stack.peek();
            boolean hasChild = (current.left != null || current.right != null);
            boolean isPrevLastChild = (prev == current.right ||
                    (prev == current.left && current.right == null));

            if (!hasChild || isPrevLastChild) {
                current = stack.pop();
                current.visit();
                prev = current;
            } else {
                if (current.right != null) {
                    stack.push(current.right);
                }
                if (current.left != null) {
                    stack.push(current.left);
                }
            }
        }
    }


}
