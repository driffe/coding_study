package July20HW;

import java.util.Scanner;

public class myHW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any sentence: ");
        String getSentence = sc.nextLine();
        System.out.print("Change to the number: " + fixNum(getSentence));
    }
    public static String fixNum(String getSentence) {
        char[] vowel = {'a', 'o', 'i', 'u', 'e'};
        char blank = ' ';
        String output = "";

        for (int i = 0; i < getSentence.length(); i++) {

            if (getSentence.charAt(i) == vowel[0] || getSentence.charAt(i) == vowel[1] || getSentence.charAt(i) == vowel[2] || getSentence.charAt(i) == vowel[3]
                    || getSentence.charAt(i) == vowel[4]) {
                output = output.concat("0");
            } else if (getSentence.charAt(i) == blank) {
                output = output.concat("9");
            } else {
                output = output.concat("1");
            }
        }
        return output;
    }
}


