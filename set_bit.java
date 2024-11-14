public class set_bit {
    public static void main(String[] args){
        int n = 10; // binary: 1010
        int pos = 2; // position to set bit at
        int mask = 1 << pos; // create mask to set bit at pos
        System.out.println("Before value of " + n + " is : " + Integer.toBinaryString(n));
        n = n | mask; // set bit at pos
        System.out.println("After: " + Integer.toBinaryString(n));
        
    }

}
