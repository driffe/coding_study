package june1Homework;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive integer: ");
        int num = sc.nextInt();

        if(num <= 0) {
            System.out.println("This is not positive integer.");
        }else {
            for(int i = 0; i < num * 2 + 1; i++) {
                System.out.print("#");
            }
            System.out.println();

            for(int j = 1; j <= num; j++) {
                System.out.print("#");
                for(int k = 1; k <= num - j; k++) {
                    System.out.print(" ");
                }
                for(int t = 1; t <= j * 2 - 1; t++) {
                    System.out.print("*");
                }
                for(int k = 1; k <= num - j; k++) {
                    System.out.print(" ");
                }
                System.out.print("#");
                System.out.println();
            }
            for(int p = num - 1; p >= 1; p--) {
                System.out.print("#");
                for(int r = 0; r < num - p; r++) {
                    System.out.print(" ");
                }
                for(int n = 0; n < p * 2 - 1; n++) {
                    System.out.print("*");
                }
                for(int r = 0; r < num - p; r++) {
                    System.out.print(" ");
                }
                System.out.print("#");
                System.out.println();
            }

            for(int i = 0; i < num * 2 + 1; i++) {
                System.out.print("#");
            }
        }
    }
}
