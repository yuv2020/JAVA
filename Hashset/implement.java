package Hashset;

import java.util.LinkedList;
import java.util.*;
import javax.swing.JComboBox;

public class implement {
    static class HashMap<K, V>{     //Generics 
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n;  //n-nodes
        private int N;  //N-buckets
        private LinkedList<Node> buckets[];     //N = length of buckets

        @SuppressWarnings("Unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];

            for(int i=0; i<4; i++){
                this.buckets[i]= new LinkedList<>();

            }
        }

        private int hashfunction(K key){
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        private int searchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            for(int i=0; i<ll.size(); i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }

            return -1;
        }
        
        @SuppressWarnings("Unchecked")
        private void rehash(){
            LinkedList<Node> oldbuckets[] = buckets;
            buckets = new LinkedList[N*2];

            for(int i=0; i<N*2; i++){
                buckets[i] = new LinkedList();
            }

            for(int i=0; i<oldbuckets.length; i++){
                LinkedList<Node> ll = oldbuckets[i];
                for(int j=0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value){
            int bi = hashfunction(key);     //bucket index
            int di = searchInLL(key, bi);       // data index

            if(di == -1){       //key doesn'texists
                buckets[bi].add(new Node(key, value));
                n++;
            }
            else{       //Key  exists
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            double lambda = (double)n/N;
            if(lambda > 2.0){
                // Rehashing
                rehash();
            }
        }

        public boolean containsKey(K key){
            int bi = hashfunction(key);     //bucket index
            int di = searchInLL(key, bi);       // data index

            if(di == -1){       //key doesn'texists
                return false;
            }
            else{       //Key  exists
               return true;
            }
        }

        public V remove(K key){
            int bi = hashfunction(key);     //bucket index
            int di = searchInLL(key, bi);       // data index

            if(di == -1){       //key doesn'texists
               return null;
            }
            else{       //Key  exists
                Node node = buckets[bi].remove(di);
                return node.value;
            }
        }

        public V get(K key){
            int bi = hashfunction(key);     //bucket index
            int di = searchInLL(key, bi);       // data index

            if(di == -1){       //key doesn'texists
                return null;
            }
            else{       //Key  exists
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0; i<buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for(int j=0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n==0;
        }
    }
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 8979);
        map.put("China", 8097);
        map.put("America", 1897);
        map.put("Korae", 8987);

        ArrayList<String> keys = map.keySet();
        for(int i=0; i<keys.size(); i++) {
            System.out.println(keys.get(i) + " : " + map.get(keys.get(i)));
        }
        map.remove("India");
        System.out.println("After removing India: " + map.keySet());
    }
}
