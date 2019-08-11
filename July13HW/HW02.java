package July13HW;

import java.util.Scanner;

public class HW02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String: ");
        String getStr = sc.nextLine();
        System.out.println();
        System.out.println("Original String: " + getStr);
        System.out.print("Result: ");
        //Loop that only subtract odd ones from str.
        for(int i = 1; i < getStr.length(); i = i + 2) {
            char oddChar = getStr.charAt(i);
            System.out.print(oddChar);
        }
    }
}
