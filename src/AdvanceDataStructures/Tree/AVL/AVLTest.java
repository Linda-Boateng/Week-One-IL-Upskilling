package AdvanceDataStructures.Tree.AVL;

public class AVLTest {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);

        System.out.println("Inorder traversal of the AVL tree after insertion:");
        tree.inorderTraversal(tree.root);
        System.out.println();

        tree.root = tree.deleteNode(tree.root, 20);

        System.out.println("Inorder traversal of the AVL tree after deletion:");
        tree.inorderTraversal(tree.root);
        System.out.println();

        System.out.println("Searching for key 30: " + tree.search(tree.root, 30));
    }
}
