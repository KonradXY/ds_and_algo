package _6_tree.dfs;

import java.util.ArrayDeque;
import java.util.Deque;

public class _0_PreOrder {

    /**
     * Preorder Traversal
     * In preorder traversal, we traverse the root first, then the left and right subtrees.
     * We can simply implement preorder traversal using recursion:
     * Visit current node
     * Traverse left subtree
     * Traverse right subtree
     */
    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        root.visit();
        preOrder(root.left);
        preOrder(root.right);
    }

    /**
     // To implement an iterative preorder traversal, we’ll need a Stack, and we’ll go through these steps:
     //
     // Push root in our stack
     // While stack is not empty
     // Pop current node
     // Visit current node
     // Push right child, then left child to stack
     */

    public void preOrderWithoutRecursion(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode current;
        stack.push(root);
        while (!stack.isEmpty()) {
            current = stack.pop();
            current.visit();

            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
        }
    }


}
