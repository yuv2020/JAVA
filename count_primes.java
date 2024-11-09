import java.util.Scanner;
import java.util.*;

public class count_primes {
    public static int countPrimes(int n) {
        if(n<=2){
            return 0;
        }

        boolean[] isPrime = new boolean[n+1];
        for(int i=0; i<=n; i++){
            isPrime[i] = true;
        }
        
        isPrime[0] = isPrime[1] = false;
        
        for(int p=2; p*p<=n; p++){
            if(isPrime[p]){
                for(int i=p*p; i<=n; i+=p){
                    isPrime[i] = false;
                }
            }
        }
        
        int count = 0;
        for(int i=2; i<=n; i++){
            if(isPrime[i]){
                count++;
            }
        }        
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countPrimes(n));
    }    
}
