package june1Homework;

import java.util.Scanner;

public class HW04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive integer: ");
        int num = sc.nextInt();

        if(num <= 0) {
            System.out.println("This is not positive integer.");
        }else {
            for(int k = 0; k < num; k++) {
                for(int m = num - k; m >= 1; m--) {
                    System.out.print(m);
                }
                System.out.println();
            }
            for(int j = 1; j < num; j++) {
                for(int t = j + 1 ; t >= 1; t--) {
                    System.out.print(t);
                }
                System.out.println();
            }
        }
    }
}
