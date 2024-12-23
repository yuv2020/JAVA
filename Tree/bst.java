package Tree;

import java.util.*;

public class bst {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }

        if(root.data>key){
            return search(root.left, key);
        }

        else if(root.data==key){
            return true;
        }

        else if(root.data<key){
            return search(root.right, key);
        }

        else{
            return search(root.right, key);
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data>val){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static Node delete(Node root, int key){
        if(root.data > key){
            root.left = delete(root.left, key);
        }

        else if(root.data < key){
            root.right = delete(root.right, key);
        }

        else{   // root.data == key
            //case 1
            if(root.left == null && root.right == null){
                return null;
            }

            //Case 2
            if(root.left == null ){
                return root.right;
            }

            else if(root.right == null){
                return root.left;
            }

            //Case 3
            Node is = inordernode(root.right);
            root.data = is.data;
            Node right = delete(root.right, is.data);
        }
        return root;
    }

    public static Node inordernode(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    // Range of child of the tree
    public static void printinrange(Node root, int x, int y){
        if(root == null){
            return;
        }

        if(root.data >= x && root.data <= y){
            printinrange(root.left, x, y);
            System.out.println(root.data + " ");
            printinrange(root.right, x, y);
        }
        else if(root.data >= y){
            printinrange(root.left, x, y);           
        }

        else{
            printinrange(root.right, x, y);
        }
    }

    //Print the remove path of the tree leaf
    public static void printrootleaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);

        //leaf node 
        if(root.left == null && root.right == null){
            printpath(path);
        }
        else{   //non- leaf nodes
            printrootleaf(root.left, path);
            printrootleaf(root.right, path);
        }

        path.remove(path.size()-1);
    }

    public static void printpath(ArrayList<Integer> path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i) + "->");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        // int values[] = {5,1,3,4,2,7};
        int values[] = {8,5,3,1,4,6,11,14};
        Node root = null;
        int val = 5;

        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
            System.out.println("After inserting " + values[i] + " into the BST:");
            inOrder(root);
            System.out.println();
        }
        if(search(root,val)){
            System.out.println("found"); 
        }
        else{
            System.out.println("Not found");
        }

        delete(root, val);
        inOrder(root);
        System.out.println();

        printinrange(root, 3, 12);

        System.out.println("The range of leaf nodes is: ");

        printrootleaf(root, new ArrayList<>());

    }
}
