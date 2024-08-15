//Square Pattern
package patterns;

public class square{
    public static void main(String args[]){
        int a=4;
        int b=5;

        //outer loop
        for(int i=1; i<=a; i++){
            //inner loop
            for(int j=1; j<=b; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}