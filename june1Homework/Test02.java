package june1Homework;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        for(int i = num; i >= 1; i--) {
            for(int j = i; j >= 1; j--) {
                for(int k = 1; k <= j; k++) {
                    int sum = k * 2 - 1;
                    System.out.print(sum);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
