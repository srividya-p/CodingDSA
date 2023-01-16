package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class ConnectedNode{
    ConnectedNode left, right, nextRight;
    private int data;

    public ConnectedNode(int data) {
        this.data = data;
        left = right = nextRight = null;
    }

    public int getData() {
        return data;
    }
}

public class NodesAtLevelConnectedTree {
    ConnectedNode root;

    public NodesAtLevelConnectedTree () {
        root = null;
    }

    public void connectNodesAtSameLevel(ConnectedNode root) {
        Queue<ConnectedNode> q = new LinkedList<>();

        ConnectedNode temp = null;
        q.add(root);

        while(!q.isEmpty()){
            int n = q.size();

            for(int i=0; i<n; i++) {
                ConnectedNode prev = temp;
                temp = q.poll();

                if (i>0){
                    prev.nextRight = temp;
                }

                if(temp.left != null) {
                    q.add(temp.left);
                }

                if(temp.right != null){
                    q.add(temp.right);
                }
            }

            temp.nextRight = null;

        }
    }

    // Tree
    //         1
    //       /   \
    //     2       3
    //   /   \
    // 4       5

    public static void main(String args[]) {
        NodesAtLevelConnectedTree tree = new NodesAtLevelConnectedTree();

        tree.root = new ConnectedNode(1);
        tree.root.left = new ConnectedNode(2);
        tree.root.right = new ConnectedNode(3);
        tree.root.left.left = new ConnectedNode(4);
        tree.root.left.right = new ConnectedNode(5);
        
        tree.connectNodesAtSameLevel(tree.root);

        System.out.println("Following are populated nextRight pointers in the tree (-1 is printed if there is no nextRight) - ");
        
        int a = tree.root.nextRight != null ? tree.root.nextRight.getData() : -1;
        System.out.println("nextRight of " + tree.root.getData() + " is " + a);
        
        int b = tree.root.left.nextRight != null ? tree.root.left.nextRight.getData() : -1;
        System.out.println("nextRight of " + tree.root.left.getData() + " is " + b);
        
        int c = tree.root.right.nextRight != null ? tree.root.right.nextRight.getData() : -1;
        System.out.println("nextRight of " + tree.root.right.getData() + " is " + c);
        
        int d = tree.root.left.left.nextRight != null ? tree.root.left.left.nextRight.getData() : -1;
        System.out.println("nextRight of " + tree.root.left.left.getData() + " is " + d);

        int e = tree.root.left.right.nextRight != null ? tree.root.left.right.nextRight.getData() : -1;
        System.out.println("nextRight of " + tree.root.left.right.getData() + " is " + e);
    }
}
