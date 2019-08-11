package july31HW;

import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive number: ");
        int getNum = sc.nextInt();
        System.out.print("The " + getNum + "! is " + factorial(getNum));
    }
    public static int factorial(int getNum) {
        if(getNum == 1) {
            return 1;
        }else {
            return getNum * factorial(getNum - 1);
        }
    }
}
