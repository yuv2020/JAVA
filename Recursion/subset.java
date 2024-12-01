package Recursion;

//print all subsets of n natural unumbers
public class subset {

    public static printsubset(List<Integer> subset){
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }
    public static void findsubset( int n, ArrayList<Integer> a) {
        if(n==0){
            printsubset(n, a);
            return;
        }
        
        //add hoga
        a.add(n);
        findsubset(n-1, a)

        //not adding
        a.remove(a.size()-1);
        findsubset(n-1, a);

    }

    public static void main(String[] args) {
        int n = 9;
        ArrayList<Integer> a = new ArrayList<>();
        findsubset(n, a);
    }

    
}
