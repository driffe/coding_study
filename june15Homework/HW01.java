package june15Homework;

import java.util.Scanner;

public class HW01{
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
                while(j <= i) {
                    System.out.print(j + 1);
                    j++;
                }
                System.out.println();
                i++;
            }
            i = 0;
            while(i < num) {
                int j = 0;
                while(j < num - i - 1) {
                    System.out.print(j + 1);
                    j++;
                }
                System.out.println();
                i++;
            }
        }
    }
}
