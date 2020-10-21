package Base_Algorithms.G_Tree_BinarySearchInsertion;

public class Tree {

    private TreeNode root;
    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        }
        else {
            root.insert(value);
        }
    }
}
