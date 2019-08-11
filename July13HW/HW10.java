package July13HW;

import java.util.Scanner;

public class HW10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any sentence: ");
        String getStr = sc.nextLine();
        String wordArr[] = getStr.split(" ");
        int i = 0;
        //loop that count the number of word in sentence.
        for(; i < wordArr.length;) {
            i++;
        }
        System.out.print("The number of words in sentence: " + i);
    }
}
