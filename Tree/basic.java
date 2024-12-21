package Tree;

// Create the tree
import java.util.*;
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

    //Print the Level order node
    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currnode = q.remove();
            if (currnode == null) {
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }

            else{
                System.out.print(currnode.data + " ");
                if(currnode.left != null){
                    q.add(currnode.left);
                }

                if(currnode.right != null){
                    q.add(currnode.right);
                }
            }
        }
    }

    //Count the no. of nodes
    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftnodes = countNodes(root.left);
        int rightnodes = countNodes(root.right);

        return leftnodes + rightnodes + 1;   
    }

    //Sum of nodes in the tree
    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftsum = sumOfNodes(root.left);
        int rightsum = sumOfNodes(root.right);

        return leftsum + rightsum + root.data;
    }

    //Height of a tree 
    public static int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        }

        int leftheight = heightOfTree(root.left);
        int rightheight = heightOfTree(root.right);

        int maxheight = Math.max(leftheight, rightheight) + 1;

        return maxheight;
    }

    //Diameter of tree (No. of the nodes in the longest path between any 2 nodes)
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }

        int d1 = diameter(root.left);
        int d2 = diameter(root.right);
        int d3 = heightOfTree(root.left) + heightOfTree(root.right) + 1;

        return Math.max(d3, Math.max(d1,d2));
    }

    //2nd approach to insert diameter of tree
    static class TreeInfo{
        int height;
        int diameter;

        TreeInfo(int height, int diameter){
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static TreeInfo diameter2(Node root){
        if(root == null){
            return new TreeInfo(0,0);
        }

        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int maxheight = Math.max(left.height, right.height) + 1;

        int d1 = left.diameter;
        int d2 = right.diameter;
        int d3 = left.height + right.height + 1;
        
        int my_diameter = Math.max(Math.max(d1,d2),d3);

        TreeInfo my_info = new TreeInfo(maxheight, my_diameter);

        return my_info;
    }

    public static void main(String[] args){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(nodes);
        // preOrder(root);
        // inOrder(root);
        // postOrder(root);
        // levelOrder(root);

        System.out.print("Total Nodes in the tree is : " + countNodes(root));
        System.out.print("\nSum of nodes in the tree is : " + sumOfNodes(root));
        System.out.print("\nThe height of tree is : " + heightOfTree(root));
        System.out.print("\nThe diameter of tree is : " + diameter(root));
        System.out.println("\nThe diameter of tree by 2nd approach is : " + diameter2(root).diameter);
        

        // System.out.println("Inorder traversal of constructed tree is : " + root.data);
    }
    
}
