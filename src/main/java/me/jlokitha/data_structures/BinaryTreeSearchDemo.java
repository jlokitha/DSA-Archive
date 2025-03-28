package me.jlokitha.data_structures;

/**
 * -----------------------------------------------------------------------------
 * Author    : Janindu Lokitha
 * Created   : 28/03/2025
 * Portfolio : https://jlokitha.me/
 * GitHub    : https://github.com/jlokitha
 * -----------------------------------------------------------------------------
 * Description: [Brief description of this file’s purpose.]
 */
public class BinaryTreeSearchDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(10);
        binaryTree.insert(5);
        binaryTree.insert(15);
        binaryTree.insert(3);

        binaryTree.inOrder();
    }
}

class Node {
    int data;
    Node left;
    Node right;

    public Node (int data) {
        this.data = data;
    }
}

class BinaryTree {

    Node root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    public Node insertRec(Node root, int data) {
        if (root == null)
            root = new Node(data);
        else if(data < root.data)
            root.left = insertRec(root.left, data);
        else if(data > root.data)
            root.right = insertRec(root.right, data);

        return root;
    }

    public void inOrder() {
        inOrderRec(root);
    }

    public void inOrderRec(Node root) {
        if(root!=null) {
            inOrderRec(root.left);
            System.out.println(root.data);
            inOrderRec(root.right);
        }
    }
}