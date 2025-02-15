package Interview;

public class prime{
    public static void main(String[] args){
        int n = 3;
        boolean p = isprime(n, 2);
        System.out.println(p);
    }

    // public static boolean isprime(int num){
    //     if(num%2 != 0){
    //         return true;
    //     }
    //     return false;
    // }

    // public static boolean isprime(int num){
    //     if(num <= 1)
    //         return false;
    //     for(int i = 2; i * i <= num; i++){
    //         if(num % i == 0)
    //             return false;
    //     }
    //     return true;
    // }

    public static boolean isprime(int num, int i){
        if(i * i > num)
            return true;
        if(num % i == 0)
            return false;
        return isprime(num, i + 1);
    }

    // public static boolean isPrime(int num, int i, int count){
    //     if(count > 10)
    //         return false;
    //     if(i * i > num)
    //         return true;
    //     if(num % i == 0)
    //         return false;
    //     return isPrime(num, i + 1, count + 1);
    // }
}