package june15Homework;

import java.util.Scanner;

public class HW03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive integer: ");
        int num = sc.nextInt();
        if(num < 0) {
            System.out.println("Error: This is not positive integer");
        } else {
            int i = 0;
            while(i < num) {
                int j = 0;
                while(j < num - i) {
                    System.out.print(" ");
                    j++;
                }
                int k = 0;
                while(k < i * 2 + 1) {
                    System.out.print("*");
                    k++;
                }
                System.out.println();
                i++;
            }
        }
    }
}
