package July13HW;

import java.util.Scanner;

public class HW03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Standard String: ");
        String standardStr = sc.nextLine();
        System.out.print("Enter a comparison target: ");
        String compareStr = sc.nextLine();
        System.out.println();
        //Boolean compare first string and second string(ignorecase)
        boolean result = standardStr.equalsIgnoreCase(compareStr);
        System.out.println("Result: " + result);
    }
}
