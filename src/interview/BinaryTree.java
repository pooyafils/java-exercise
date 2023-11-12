package interview;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    // Method to insert a new node with the given data
    public void insert(int data) {
        root = insertRec(root, data);
    }

    // A recursive method to insert a new node with the given data
    private Node insertRec(Node root, int data) {
        // If the tree is empty, create a new node
        if (root == null) {
            root = new Node(data);
            return root;
        }

        // Otherwise, recur down the tree
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        // Return the unchanged node pointer
        return root;
    }

    // Method to perform an inorder traversal of the binary tree
    public void inorder() {
        inorderRec(root);
    }

    // A utility method to perform an inorder traversal of the binary tree
    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Inserting elements into the binary tree
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Performing an inorder traversal to display the elements
        System.out.println("Inorder traversal of the binary tree:");
        tree.inorder();
    }
}