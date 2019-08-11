package July13HW;

import java.util.Scanner;

public class HW11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any sentence: ");
        String getStr = sc.nextLine();
        String wordArr[] = getStr.split(" ");
        //loop through arr in reverse order
        for(int i = wordArr.length - 1; i >= 0; i--) {
            System.out.print(wordArr[i] + " ");
        }
    }
}
