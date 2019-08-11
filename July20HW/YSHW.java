package July20HW;

import java.util.Arrays;
import java.util.Scanner;

public class YSHW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any sentence: ");
        String getOddSentence = sc.nextLine();
        System.out.print("Enter any sentence: ");
        String getEvenSentence = sc.nextLine();
        System.out.print("The Result: " + fixSentence(getOddSentence,getEvenSentence));
    }
    public static String result(String[] finalArr) {
        String output = "";
        for(int i = 0; i < finalArr.length; i++) {
            output = output + finalArr[i] + " ";
        }
        return output.substring(0, output.length() - 1);
    }
    public static String fixSentence(String getOddSentence, String getEvenSentence) {
        String[] oddStr = getOddSentence.split(" ");
        String[] evenStr = getEvenSentence.split( " ");
        String[] finalArr;

        if(oddStr.length > evenStr.length) {
            finalArr = new String[oddStr.length];
            for(int i = 0; i < finalArr.length; i++) {
                finalArr[i] = oddStr[i];
            }
            for(int i = 0; i < evenStr.length; i++) {
                if(i % 2 == 1) {
                    finalArr[i] = evenStr[i];
                }
            }
        } else {
            finalArr = new String[evenStr.length];
            for(int i = 0; i < finalArr.length; i++) {
                finalArr[i] = oddStr[i];
            }
            for(int i = 0; i < oddStr.length; i++) {
                if(i % 2 == 0) {
                    finalArr[i] = oddStr[i];
                }
            }
        }
        return result(finalArr);
    }
}
/*
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any sentence: ");
        String getOddSentence = sc.nextLine();
        System.out.print("Enter any sentence: ");
        String getEvenSentence = sc.nextLine();
        System.out.print("The Result: " + result(getOddSentence,getEvenSentence));
    }
    public static String result(String getOddSentence, String getEvenSentence) {
        String[] oddStr = getOddSentence.split(" ");
        String[] evenStr = getEvenSentence.split( " ");
        String[] finalArr = new String[0];
        String finalSentence = "";

        if(oddStr.length > evenStr.length) {
            finalArr = new String[evenStr.length];
        } else if (oddStr.length <= evenStr.length) {
            finalArr = new String[oddStr.length];
        }
        for(int i = 0; i < finalArr.length; i++) {
            if( i % 2 == 0) {
                    finalSentence = finalSentence + oddStr[i] + " ";
            } else {
                    finalSentence = finalSentence + evenStr[i] + " ";
            }
        }
        if(oddStr.length > evenStr.length) {
            for(int i = finalArr.length; i < oddStr.length; i++) {
                finalSentence = finalSentence + oddStr[i] + " ";
            }
        } else if (oddStr.length < evenStr.length) {
            for(int i = finalArr.length; i < evenStr.length; i++) {
                finalSentence = finalSentence + evenStr[i] + " ";
            }
        }
        return finalSentence.substring(0,finalSentence.length() - 1);
    }
 */
/*
문장2개를받고, 첫번째문장에서는 홀수번째단어를
두번째 문장에서는 짝수번째 단어를 찾아 한문장으로 출력하시오

Ex)
Input : i am a boy
            You are a girl
Output : i are a girl (홀,짝,홀,짝 순서대로)

 */


