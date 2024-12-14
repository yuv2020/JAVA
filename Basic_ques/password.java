package Basic_ques;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class password {
    public static boolean is_valid_password(String password) {
        String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$";

        // Correct way to use Pattern.compile() without 'new'
        Pattern p = Pattern.compile(regex);

        if (password == null) {
            return false;
        }

        // Create a Matcher object using the pattern
        Matcher m = p.matcher(password);
        return m.matches();
    }

    public static void main(String args[]) {
        String s1 = "Geeks@portal2020";
        System.out.println(is_valid_password(s1));  // true

        String s2 = "YuvrajThakur";
        System.out.println(is_valid_password(s2));  // false

        String s3 = "Yuv@ 123";
        System.out.println(is_valid_password(s3));  // false (contains space)

        String s4 = "1234";
        System.out.println(is_valid_password(s4));  // false (too short)

        String s5 = "YUv@1234";
        System.out.println(is_valid_password(s5));  // true

        String s6 = "yuv2020*123 987";
        System.out.println(is_valid_password(s6));  // false (contains space)
    }
}
