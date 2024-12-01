package Recursion;

public class backtracking{
    public static void track(String str, String perm, int index){
        if(str.length() == 0){
            System.out.println(perm);
            return ;
        }
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            String newstr = str.substring(0,i) + str.substring(i+1);
            track(newstr, perm + curr, index+1);
        }
        
    }
    public static void main(String[] args) {
        String str = "ABC";
        int index = 0;
        String perm = "";
        System.out.println("After permutation : " );
        track(str, perm, index);

    }
}