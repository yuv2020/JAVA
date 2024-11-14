package Recursion;

public class move {
    public static void moveall(String str, int index, int count, String newstr){
        if(index == str.length()){
            for(int i=0; i<count; i++){
                newstr += "x";
            }
            System.out.println("The new string is : " + newstr);
            return;
        }

        char c = str.charAt(index);
        if(c == 'x'){
            count ++;
            moveall(str, index+1, count, newstr);
        }
        else{
            newstr += c;
            moveall(str, index+1, count, newstr);
        }
    }
    public static void main(String[] args) {
        String str = " movexallxall";
        int count = 0;;
        int index = 0;
        String newstr = "";
        moveall(str, index, count, newstr);
     
    }
    
}
