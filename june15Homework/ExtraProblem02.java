package june15Homework;

import java.util.Scanner;

public class ExtraProblem02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("Enter the positive integer: ");
            int num = sc.nextInt();
            double cal;
            cal = num * (num + 1) / 2;
            if(num == 0) {
                System.out.print("The End!");
                break;
            } else if (num < 0) {
                System.out.print("This is not a positive integer!");
                break;
            }
            System.out.print((int)cal);
            System.out.println();
        }
    }
}
