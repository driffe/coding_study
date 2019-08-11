package July13HW;

import java.util.Scanner;

public class HW09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any word: ");
        String getStr = sc.nextLine();
        //get a value of half length of str
        int halfOfLength = getStr.length() / 2;
        //string that staring point to half point
        String formerStr = getStr.substring(0, halfOfLength);
        //string that half point to end point
        String latterStr = getStr.substring((halfOfLength));

        System.out.println(formerStr + " & " + latterStr);
    }
}
