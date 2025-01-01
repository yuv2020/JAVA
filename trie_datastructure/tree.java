package trie_datastructure;

//Created the trie data structure

public class tree {
    static class Node{
        Node[] children;
        boolean eow;        //end of words

        public Node(){
            children = new Node[26];
            for(int i = 0; i < 26; i++){
                children[i] = null;
            }
            eow = false;  // initially, no end of word marker is set.
        }
    }

    static Node root = new Node();
    
    public static void insert(String word){
        Node curr = root;
        for(int i = 0; i < word.length(); i++){
            int index = word.charAt(i) - 'a';

            if(curr.children[index] == null){
                // add new node
                curr.children[index] = new Node();
            }
            if(i == word.length()-1){
                curr.children[index].eow = true;  // mark the end of word
            }
            curr = curr.children[index];
        }
    }

    //Search for the element in the children array of node

    public static boolean search(String key){
        Node curr = root;
        for(int i = 0; i < key.length(); i++){
            int index = key.charAt(i) - 'a';
            Node node = curr.children[index];

            if(node == null){
                return false;
            }

            if (i==key.length() - 1 && node.eow == false){
                return false;                
            }

            curr = node; 
        }
        return true;
    }

    public static void main(String[] args){
        String words[] = {"the", "a", "there", "their", "any"};

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        System.out.println(search("their"));        //true
        System.out.println(search("them"));         //false
        System.out.println(search("hello"));        //false
        System.out.println(search("any"));          //true
        

        // for(String word: words){
        //     insert(word);
        // }
    }
    
}
