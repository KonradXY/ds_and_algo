package _6_tree.dfs;

public class GraphNode {

    public int val;
    public GraphNode[] neighbors;
    public boolean visited;

    public GraphNode() {
        this.val = 0;
        this.neighbors = new GraphNode[0];
    }

    public GraphNode(int val) {
        this.val = val;
        this.neighbors = new GraphNode[0];
    }

    public GraphNode(int val, GraphNode[] neighbors) {
        this.val = val;
        this.neighbors = neighbors;
    }

    public int visit() {
        visited = true;
        return val;
    }
}
