package june15Homework;

import java.util.Scanner;

public class HW05 {
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
                while(j < i) {
                    System.out.print(" ");
                    j++;
                }
                int k = num - i;
                while(k > 0) {
                    System.out.print("*");
                    k--;
                }
                System.out.println();
                i++;
            }
            i = 0;
            while(i < num) {
                int j = num;
                while(j > 0) {
                    System.out.print(" ");
                    j--;
                }
                int k = 0;
                while(k <= i) {
                    System.out.print("*");
                    k++;
                }
                System.out.println();
                i++;
            }
        }
    }
}
