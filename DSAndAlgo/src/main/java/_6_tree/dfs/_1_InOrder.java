package _6_tree.dfs;

import java.util.ArrayDeque;
import java.util.Deque;

public class _1_InOrder {

    /**
     * For inorder traversal, we traverse the left subtree first, then the root, then finally the right subtree.
     * Inorder traversal for a binary search tree means traversing the nodes in increasing order of their values.
     * We can simply implement inorder traversal using recursion:
     */
    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        root.visit();
        inOrder(root.right);
    }

    /**
     * We can also implement inorder traversal without recursion, too:
     * <p>
     * Initialize current node with root
     * While current is not null or stack is not empty
     * Keep pushing left child onto stack, till we reach current node’s left-most child
     * Pop and visit the left-most node from stack
     * Set current to the right child of the popped node
     */

    public void inOrderWithoutRecursion(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            TreeNode top = stack.pop();
            top.visit();
            current = top.right;
        }
    }


}
