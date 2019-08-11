package july31HW;

import java.util.Scanner;

public class MYHW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any word: ");
        String getStr = sc.nextLine();

        int vowOutput = 0;
        int conOutput = 0;

        for(int i = 0; i < getStr.length(); i++) {
            if(getStr.charAt(i) == 'a' || getStr.charAt(i) == 'o' || getStr.charAt(i) == 'i' || getStr.charAt(i) == 'u'||
                    getStr.charAt(i) == 'e') {
                vowOutput++;
            } else{
                conOutput++;
            }
        }

        System.out.print("Number of vowel: " + vowOutput);
        System.out.println();
        System.out.print("Number of consonant: " + conOutput);
    }
}
