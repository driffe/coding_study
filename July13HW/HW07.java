package July13HW;

import java.util.Scanner;

public class HW07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Present tense: ");
        String getStr = sc.nextLine();

        String pastTenseAdd = "ed";
        //Add "ed" to end of str
        System.out.print("Past Tense: " + getStr.concat(pastTenseAdd));
    }
}
