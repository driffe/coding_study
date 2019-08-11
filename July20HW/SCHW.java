package July20HW;

import java.util.Scanner;

public class SCHW {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter any word: ");
        String getStr = sc.nextLine();
        System.out.print("The result: " + fixWord(getStr));
    }
    public static String fixWord(String getStr) {
        String output = "";
        for(int i = 0; i < getStr.length(); i++) {
            if(i % 2 == 0) {
                output = output.concat(Character.toString(getStr.charAt(getStr.length() - 1 - i)));
            } else {
                output = output.concat(Character.toString(getStr.charAt(i)));
            }
        }
        return output;
        //짝수일때 하기.
    }
}
