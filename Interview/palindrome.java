public class palindrome {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        String reversed = reverseString(input);
        System.out.println(reversed);    
    }
    
    private static String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }
}
