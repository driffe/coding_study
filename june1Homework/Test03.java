package june1Homework;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;

        for(int j = 1; j <= num; j++) {
            sum1 = sum1 + j; //1~n sum
        }
        for(int i = 1; i < num; i++) {
            int n = sc.nextInt();
            sum2 = n + sum2;
        }
        System.out.print("The result: " + (sum1 - sum2));
    }
}
