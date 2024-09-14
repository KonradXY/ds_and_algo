package _6_tree;

import _6_tree.dfs.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class _2_MaxDepthTree {

    // the simplest way to solve this problem is to use recursion
    // time and memory complexity of this solution is O(n)
    public int maxDepthDFS(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepthDFS(root.left);
        int rightDepth = maxDepthDFS(root.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }

    // the iterative DFS will look like this:
    public int iterativeDFS(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int depth = 0;
        Deque<TreeNode> stack = new ArrayDeque<>();
        Deque<Integer> depths = new ArrayDeque<>();
        stack.push(root);
        depths.push(1);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            int currentDepth = depths.pop();

            depth = Math.max(depth, currentDepth);

            stack.push(node.right);
            stack.push(node.left);

            depths.push(currentDepth + 1);
            depths.push(currentDepth + 1);
        }

        return depth;
    }

    // another solution is to use BFS
    // the number of levels in the tree is the depth of the tree
    public int maxDepthBFS(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int depth = 0;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            depth++;
        }

        return depth;
    }




}
