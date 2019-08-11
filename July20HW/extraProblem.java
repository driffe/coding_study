package July20HW;

import javax.print.DocFlavor;
import java.util.Scanner;

public class extraProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter example sentence: ");
        String exampleSentence = sc.nextLine();
        System.out.print("Enter ciphertext message: ");
        String cipherText = sc.nextLine();
        System.out.print("Enter enciphered code: ");
        String code = sc.nextLine();
        System.out.print(findCode(exampleSentence, cipherText, code));
    }
    public static String findCode(String exampleSentence, String cipherText, String code) {
        String output = "";
        for(int i = 0; i < code.length(); i++) {
            for(int j = 0; j < exampleSentence.length(); j++) {
                if(code.charAt(i) == cipherText.charAt(j)) {
                    output = output.concat(Character.toString(exampleSentence.charAt(j)));
                    break;
                } else if(!cipherText.contains(Character.toString(code.charAt(i)))) {//contain 쓰지 않기.
                    output = output.concat(".");
                    break;
                }
            }
        }

        return output;
    }
}
/*
for(int i = 0; i < code.length(); i++) {
                    for(int j = 0; j < exampleSentence.length(); j++) {
                        if(code.charAt(i) == cipherText.charAt(j)) {
                            output = output.concat(Character.toString(exampleSentence.charAt(j)));
                            break;
                        }
                    }
                }
 */
