package _6_tree.dfs;

import java.util.List;

public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public int visit() {
        return val;
    }

    public List<TreeNode> getChildren() {
        return List.of(left, right);
    }
}
