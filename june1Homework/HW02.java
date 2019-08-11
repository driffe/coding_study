package june1Homework;

import java.util.Scanner;

public class HW02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive integer: ");
        int num = sc.nextInt();

        if(num <= 0) {
            System.out.println("This is not positive integer.");
        }else {
            for(int i = 1; i <= num; i++) {
                for(int j = 1; j <= num; j++) {
                    if(i + j > num) {
                        int sum1 = num - (j - 1);
                        System.out.print(sum1);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for(int k = 1; k < num; k++) {
                for(int l = 1; l <= k; l++ ) {
                    System.out.print(" ");
                }
                    for(int m = num; m > k; m--) {
                        int sum2 = m - k;
                        System.out.print(sum2);
                    }
                System.out.println();
            }
        }
    }
}
