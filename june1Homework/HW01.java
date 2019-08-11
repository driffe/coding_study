package june1Homework;

import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive integer: ");
        int num = sc.nextInt();

        if(num <= 0) {
            System.out.println("This is not positive integer.");
        }else {
            for(int i = 1; i <= num; i++) {
                for(int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
            for(int k = 1; k < num; k++) {
                for(int l = 1; l <= num - k ; l++ ) {
                    System.out.print(l);
                }
                System.out.println();
            }
        }
    }
}
