package July13HW;

import java.util.Scanner;

public class HW05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String getStr = sc.nextLine();
        //String except last one
        String strExceptLast = getStr.substring(0, getStr.length() - 1);
        System.out.print("Result: " + strExceptLast);
    }
}
