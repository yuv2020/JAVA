package Basic_ques;
public class get_bit {
    public static void main(String[] args) {
        int n = 5; // 0101
        int p = 2;// 00011
        int result = 1<<p;

        if((result & n) == 0) {
            System.out.println("The bit at position " + p + " is 0");
        }
        else{
            System.out.println("The bit at position " + p + " is 1");
        }

        System.out.print("The result is " + result);
    }    
}
