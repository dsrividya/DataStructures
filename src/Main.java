class Node1 {
    int data;
    Node left, right;

    // Constructor
    public Node1(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    // In-order traversal (Left, Root, Right)
    void inorderTraversal(Node node) {
        if (node == null)
            return;

        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }

    // Insert nodes manually
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Create nodes
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // Display in-order traversal
        System.out.print("Inorder traversal: ");
        tree.inorderTraversal(tree.root);
    }
}
