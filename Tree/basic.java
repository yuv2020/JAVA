package Tree;

// Create the tree

import com.sun.source.tree.BinaryTree;

public class basic {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int index = -1;
        public static Node buildtree(int nodes[]){
            index++;
            if(nodes[index] == -1){
                return null;
            }

            Node newnode = new Node(nodes[index]);  //  create  new node    
            newnode.left = buildtree(nodes);
            newnode.right = buildtree(nodes);

            return newnode;  //  return the root node of the constructed tree

        }
    }

    //Print the preorder root node
    public static void preOrder(Node root) {
        if (root == null){
            return;
        }
        
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //Print the Inorder root node
    public static void inOrder(Node root) {
        if (root == null){
            return;
        }
        
        inOrder(root.left);
        System.out.print(root.data + " ");  
        inOrder(root.right);
    }

    //Print the postorder root node
    public static void postOrder(Node root) {
        if (root == null){
            return;
        }
        
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(nodes);
        // preOrder(root);
        // inOrder(root);
        postOrder(root);

        // System.out.println("Inorder traversal of constructed tree is : " + root.data);
    }
    
}
