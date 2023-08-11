package Trees;

class Node {
    int item;
    Node left, right;

    public Node(int key) {
        item = key;
        left = right = null;
    }
}

class preorder {
    // root of Tree
    Node root;

    preorder() {
        root = null;
    }

    void preorder(Node node) {
        if (node == null)
            return;

        // traverse the root node
        System.out.print(node.item +" "); //In the pre- order traversal first print then left child call and then right child. (root, left, right)
        // traverse the left child
        preorder(node.left); // In the In-Order traversal first call left child and then print value and then call right child. (left, Root, right)
        // traverse the right child
        preorder(node.right); // In post order traversal first left child call then right child and then print. (left, right, root)
    }

    public static void main(String[] args) {
        // create object of tree
        preorder tree = new preorder();

        // create nodes of the tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.right.left = new Node(8);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.right.left = new Node(9);
        tree.root.right.right.right = new Node(10);

        // preorder tree traversal
        System.out.println("\nPreorder traversal ");
        tree.preorder(tree.root);
    }
}