package July13HW;

import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String: ");
        String getStr = sc.nextLine();
        //Make middle one of string to starting point
        int startingPoint = getStr.length() / 2;

        System.out.println();
        //Show Original String
        System.out.println("Original String: " + getStr);
        //Make a string (middle to end)
        String formerHalf = getStr.substring(startingPoint);
        //Make a string (starting point to middle)
        String latterHalf = getStr.substring(0, startingPoint);
        System.out.println("Result: "+ formerHalf + latterHalf);
    }
}
