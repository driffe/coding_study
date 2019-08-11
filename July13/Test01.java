package July13;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String reversedString = reverse(str);
        System.out.print(reversedString);
    }


    // Reverse a given string.
    // input: "abc"
    // output: "cba"
    public static String reverse(String str) {
        String str2 = "";
        // Loop through str in reverse order.
        for (int i = str.length() - 1; i >= 0; i--) {
            // Character.toString is used because concat takes in a string.
            str2 = str2.concat(Character.toString(str.charAt(i)));
        }
        return str2;
    }
}