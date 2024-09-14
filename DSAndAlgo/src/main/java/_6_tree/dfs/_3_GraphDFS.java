package _6_tree.dfs;

public class _3_GraphDFS {

    /**
     * The main difference between graphs and trees is that graphs may contain cycles.
     * <p>
     * So to avoid searching in cycles, we will mark each node when we visit it.
     * <p>
     * We’ll see two implementations for graph DFS, with recursion, and without recursion.
     * <p>
     * 3.1. Graph DFS with Recursion
     * First, let’s start simple with recursion:
     * <p>
     * We’ll start from a given node
     * Mark current node as visited
     * Visit current node
     * Traverse unvisited adjacent vertices
     */

    public void dfsWithRecursion(GraphNode node) {
        if (node == null) {
            return;
        }
        node.visit();
        for (GraphNode neighbor : node.neighbors) {
            if (!neighbor.visited) {
                dfsWithRecursion(neighbor);
            }
        }
    }

}
