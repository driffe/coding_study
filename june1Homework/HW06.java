package june1Homework;

import java.util.Scanner;

public class HW06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive integer: ");
        int num = sc.nextInt();

        if(num <= 0) {
            System.out.println("This is not positive integer.");
        }else {
            for(int i = 1; i <= num; i++) {
                for(int j = 1; j <= num - i; j++) {
                    System.out.print(" ");
                }
                for(int k = 1; k <= i * 2 - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int k = num - 1; k >= 1; k--) {
                for(int h = 1; h <= num - k; h++) {
                    System.out.print(" ");
                }
                for(int t = 1; t <= k * 2 - 1 ; t++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
