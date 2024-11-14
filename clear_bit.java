public class clear_bit {
    public static void main(String[] args) {
        int n = 5; // 15 = 1111 in binary
        int k = 2; // 2 = 10 in binary
        System.out.println("Number: " + n);
        System.out.println("Bit position: " + k);

        int bitmask = 1<<k;
        int notbitmask = ~bitmask;
        

        int ans= notbitmask & n;

        System.out.println("Clear bit: " + ans);

        System.out.println("Binary representation of cleared bit: " + Integer.toBinaryString(ans));

    }
    
}
