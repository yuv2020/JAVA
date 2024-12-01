package Capgemini;

import java.util.Scanner;

public class hash {
    public static String hashString(String str) {
        StringBuilder s1 = new StringBuilder(); // Correct initialization
        StringBuilder s2 = new StringBuilder(); // Correct initialization

        // Iterate through the input string
        for (char ch : str.toCharArray()) { // Use `str` instead of undefined `input`
            if (ch == '#') {
                s1.append(ch); // Append '#' to s1
            } else {
                s2.append(ch); // Append other characters to s2
            }
        }

        return s1.toString() + s2.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String ans = hashString(input); // Pass `input` to the method
        System.out.println("Hashed string: " + ans);
    }
}
