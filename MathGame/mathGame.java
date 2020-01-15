package MathGame;

import java.util.Random;
import java.util.Scanner;

public class mathGame {
    public static void main(String[] args) {
        int firstElement = getRandom();
        int secondElement = getRandom();

        System.out.println("Find answer!");
        System.out.println("@ is mystery equation");

//        quiz01(firstElement, secondElement,);


    }
    public static int getRandom() {
        Random ran = new Random();
        int randomInt = ran.nextInt(100) + 1;

        return randomInt;
    }
    public static void swapElements(int first, int second) {
        int temp = first;
        first = second;
        second = first;
    }
    public static void giveHint(int firstElement, int secondElement) {
        Scanner sc = new Scanner(System.in);
        String needHint = sc.nextLine();
        System.out.print(firstElement + " ? " + secondElement + " = ");
        String hint = "hint";
        if(hint.equalsIgnoreCase(needHint)) {

        }

    }
    public static void quiz01(int firstElement, int secondElement) {
        int first = firstElement;
        int second = secondElement;
        int tempAns;
        int finalAns = 4;

        System.out.print("5" + " @ " + "14" + " = ");

        if(first < second) {
            swapElements(first, second);
            tempAns = first % second;
        } else {
            tempAns = first % second;
        }
        giveHint(firstElement, secondElement);
    }
}
