package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

// Traversals (4)
// Max Depth

class Node {
    Node left;
    Node right;
    private int data;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }

    public int getData(){
        return data;
    }
}

public class BinaryTree {

    Node root;

    public BinaryTree(){
        root = null;
    }
    
    void printPreOrderTraversal(Node node){

        if(node == null){
            return;
        }

        System.out.print(node.getData() + " ");

        printPreOrderTraversal(node.left);

        printPreOrderTraversal(node.right);

    }

    void printInOrderTraversal(Node node){
        if(node == null){
            return;
        }

        printInOrderTraversal(node.left);

        System.out.print(node.getData() + " ");

        printInOrderTraversal(node.right);

    }

    void printPostOrderTraversal(Node node){

        if(node == null) {
            return;
        }

        printPostOrderTraversal(node.left);

        printPostOrderTraversal(node.right);

        System.out.print(node.getData() + " ");
        
    }

    void printLevelOrderTraversal(Node root){
        
        Queue<Node> q  = new LinkedList<Node>();
        q.add(root);

        while (!q.isEmpty()) {
            Node node = q.poll();
            System.out.print(node.getData() + " ");

            if(node.left != null){
                q.add(node.left);
            }

            if(node.right != null) {
                q.add(node.right);
            }
        }
    }

    int getMaxDepth(Node node) {
        
        if(node == null) {
            return -1; 
            //return 0; For count from 1
        } else {
            int leftDepth = getMaxDepth(node.left);
            int rightDepth = getMaxDepth(node.right);

            if(leftDepth > rightDepth) {
                return 1 + leftDepth;
            } else {
                return 1 + rightDepth;
            }
        }
    }

    // Tree
    //         1
    //       /   \
    //     2       3
    //   /   \
    // 4       5
    
    public static void main(String args[]){
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Pre Order Traversal");
        tree.printPreOrderTraversal(tree.root);
        System.out.println("\nIn Order Traversal");
        tree.printInOrderTraversal(tree.root);
        System.out.println("\nPost Order Traversal");
        tree.printPostOrderTraversal(tree.root);
        System.out.println("\nLevel Order Traversal");
        tree.printLevelOrderTraversal(tree.root);
        System.out.println("\nMax Depth");
        int d = tree.getMaxDepth(tree.root);
        System.out.println(d);
    }
}
