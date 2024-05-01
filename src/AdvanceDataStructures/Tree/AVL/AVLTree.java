package AdvanceDataStructures.Tree.AVL;

public class AVLTree {
    AVLNode root;

    int height(AVLNode node) {
        if (node == null) return 0;
        return node.height;
    }

    int balanceFactor(AVLNode node) {
        if (node == null) return 0;
        return height(node.left) - height(node.right);
    }

    AVLNode rotateRight(AVLNode y) {
        AVLNode x = y.left;
        AVLNode T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    AVLNode rotateLeft(AVLNode x) {
        AVLNode y = x.right;
        AVLNode T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    AVLNode insert(AVLNode node, int key) {
        if (node == null) return new AVLNode(key);

        if (key < node.key) node.left = insert(node.left, key);
        else if (key > node.key) node.right = insert(node.right, key);
        else return node; // Duplicate keys not allowed

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = balanceFactor(node);

        if (balance > 1 && key < node.left.key) return rotateRight(node);

        if (balance < -1 && key > node.right.key) return rotateLeft(node);

        if (balance > 1 && key > node.left.key) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        if (balance < -1 && key < node.right.key) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    AVLNode minValueNode(AVLNode node) {
        AVLNode current = node;
        while (current.left != null) current = current.left;
        return current;
    }

    AVLNode deleteNode(AVLNode root, int key) {
        if (root == null) return root;

        if (key < root.key) root.left = deleteNode(root.left, key);
        else if (key > root.key) root.right = deleteNode(root.right, key);
        else {
            if (root.left == null || root.right == null) {
                AVLNode temp = root.left != null ? root.left : root.right;
                if (temp == null) {
                    temp = root;
                    root = null;
                } else root = temp;
            } else {
                AVLNode temp = minValueNode(root.right);
                root.key = temp.key;
                root.right = deleteNode(root.right, temp.key);
            }
        }

        if (root == null) return root;

        root.height = 1 + Math.max(height(root.left), height(root.right));

        int balance = balanceFactor(root);

        if (balance > 1 && balanceFactor(root.left) >= 0) return rotateRight(root);

        if (balance > 1 && balanceFactor(root.left) < 0) {
            root.left = rotateLeft(root.left);
            return rotateRight(root);
        }

        if (balance < -1 && balanceFactor(root.right) <= 0) return rotateLeft(root);

        if (balance < -1 && balanceFactor(root.right) > 0) {
            root.right = rotateRight(root.right);
            return rotateLeft(root);
        }

        return root;
    }

    boolean search(AVLNode root, int key) {
        if (root == null) return false;
        if (root.key == key) return true;
        if (key < root.key) return search(root.left, key);
        return search(root.right, key);
    }

    void inorderTraversal(AVLNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.key + " ");
            inorderTraversal(root.right);
        }
    }
}
