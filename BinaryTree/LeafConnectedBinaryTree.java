package BinaryTree;


public class LeafConnectedBinaryTree {

    Node root;

    public LeafConnectedBinaryTree() {
        root = null;
    }

    boolean isLeaf(Node node) {
        return (node.right != null && node.right.left == node 
            && node.left != null && node.left.right == node);
    }

    int getMaxDepth(Node node){
        if (node == null) {
            return 0;
        } 

        if (isLeaf(node)){
            return 1;
        }

        return 1 + Math.max(getMaxDepth(node.left), getMaxDepth(node.right));
    }

    // Tree
    //            1
    //          /   \
    //         2     3
    //       /   \
    //      4     5
    //    /
    //   6        

    public static void main(String args[]) {
        LeafConnectedBinaryTree tree  = new LeafConnectedBinaryTree();

        Node L1 = new Node(6);
        Node L2 = new Node(5);
        Node L3 = new Node(3);
        
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = L3;
        tree.root.left.left = new Node(4);
        tree.root.left.right = L2;
        tree.root.left.left.left = L1;

        L1.right = L2;
        L2.right = L3;
        L3.right = L1;

        L1.left = L3;
        L2.left = L1;
        L3.left = L2;

        System.out.println("\nMax Depth Special Tree");
        int d = tree.getMaxDepth(tree.root);
        System.out.println(d);
    }
}
