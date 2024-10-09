import java.util.Scanner;

public class acc4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int w = 0;
        if((n+m) == 10){
            System.out.println("0");
        }

        else{
            System.out.println((n-1)*10-(n-1)*m);
        }

    }
    
}
