package Tree;

import java.util.*;

// Driver class to test above

public class pre {
    
    // Function to perform pre-order traversal
    static class Node{
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int index = -1;
        public static Node buildtree(int nodes[]) {
            index++;
            if (nodes[index] == -1){
                return null;
            }

            Node root = new Node(nodes[index]);
            root.left = buildtree(nodes);
            root.right = buildtree(nodes);

            return root;
        }
    }

    public static void preOrder(Node root) {
        if (root == null){
            return;
        }
        
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, 3, -1, -1, 6};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(nodes);
        preOrder(root);
    }
    
}
