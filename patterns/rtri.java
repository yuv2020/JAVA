package patterns;

public class rtri {
    public static void main(String[] args) {
        int n=4;
        int x=5;

        //outer loop
        for(int i=1; i<=n; i++){
            //innerloop 1
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            //inner loop 2
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("");

        //Right Angle Triangle

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("");

        //Right Angle Triangle

        for(int i=n; i>=1; i--){
            for(int j=n; j>=i; j-- ){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("");

        // Iverted triangle

        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("");

        //Inverted half pyramid
        
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++ ){
                System.out.print("  ");
            }
            for(int j=1; j<=2*i-1; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("");

        // Half pyramid numbers with No.s

        for(int i=1; i<=x; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+ " ");
            }
            System.out.println("");
        }

        System.out.println("");

        //Inverted half pyramid with no.s
        
        for(int i=x; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+ " ");
            }
            System.out.println("");
        }
        
        System.out.println("");

        
    }
}
