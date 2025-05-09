import java.util.*;

class TreeEx{

    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }

    // Insert in BST
    public static Node insert(Node root, int val) {
        if (root == null) return new Node(val);
        if (val < root.data) root.left = insert(root.left, val);
        else root.right = insert(root.right, val);
        return root;
    }

    // Inorder Traversal
    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Level Order Traversal
    public static void levelOrder(Node root) {
        if (root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node curr = q.poll();
            System.out.print(curr.data + " ");
            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
        }
    }

    // Height of tree
    public static int height(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    // Check if BST
    public static boolean isBST(Node root, Integer min, Integer max) {
        if (root == null) return true;
        if ((min != null && root.data <= min) || (max != null && root.data >= max)) return false;
        return isBST(root.left, min, root.data) && isBST(root.right, root.data, max);
    }

    // Main method
    public static void main(String[] args) {
        int[] values = {10, 5, 15, 3, 7, 12, 18};
        Node root = null;

        // Insert elements
        for (int val : values) {
            root = insert(root, val);
        }

        System.out.print("Inorder: ");
        inorder(root);

        System.out.print("\nLevel Order: ");
        levelOrder(root);

        System.out.println("\nHeight: " + height(root));

        System.out.println("Is BST: " + isBST(root, null, null));
    }
}
