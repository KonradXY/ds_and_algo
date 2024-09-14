package _6_tree.bfs;

import _6_tree.dfs.TreeNode;

import java.util.ArrayDeque;
import java.util.Optional;
import java.util.Queue;

public class _0_TreeBFS {

    /**
     * The idea behind the BFS algorithm for trees is to maintain a queue of nodes that will ensure the order of traversal.
     * At the beginning of the algorithm, the queue contains only the root node. We’ll repeat these steps as long as the queue
     * still contains one or more nodes:
     * <p>
     * Algorithm:
     * Pop the first node from the queue
     * If that node is the one we’re searching for, then the search is over
     * Otherwise, add this node’s children to the end of the queue and repeat the steps
     *
     * @return
     */

    public Optional<TreeNode> bfs(TreeNode root, int value) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.remove();
            if (currentNode.visit() == value) {
                return Optional.of(currentNode);
            } else {
                queue.addAll(currentNode.getChildren());
            }
        }
        return Optional.empty();
    }


}
