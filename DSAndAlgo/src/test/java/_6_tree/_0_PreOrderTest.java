package _6_tree;

import _6_tree.dfs.TreeNode;
import _6_tree.dfs._0_PreOrder;
import org.testng.annotations.Test;

public class _0_PreOrderTest {

    private _0_PreOrder dfs = new _0_PreOrder();

    @Test
    public void testDepthFirstSearch() {
        TreeNode root = buildTreeNode();
    }

    private static TreeNode buildTreeNode() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        return root;
    }


}