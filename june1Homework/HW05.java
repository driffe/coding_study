package june1Homework;

import java.util.Scanner;

public class HW05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive integer: ");
        int num = sc.nextInt();

        if(num <= 0) {
            System.out.println("This is not positive integer.");
        }else {
            for(int k = 0; k < num; k++) {
                for (int l = 0; l < k; l++) {
                    System.out.print(" ");
                }
                for(int m = num; m > k; m--) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i = 1; i <= num; i++) {
                for(int j = 0; j < num; j++) {
                    System.out.print(" ");
                }
                    for(int g = 0; g < i; g++) {
                        System.out.print("*");
                    }
                    System.out.println();
            }
        }
    }
}
