package june15Homework;

import java.util.Scanner;

public class HW04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive integer: ");
        int num = sc.nextInt();
        if(num < 0) {
            System.out.println("Error: This is not positive integer");
        } else {
            int i = 0;
            while(i < num) {
                int j = num - i;
                while(j > 0) {
                    System.out.print(j);
                    j--;
                }
                System.out.println();
                i++;
            }
            i = 0;
            while(i < num - 1) {
                int j = 2 + i;
                while(j > 0) {
                    System.out.print(j);
                    j--;
                }
                System.out.println();
                i++;
            }
        }
    }
}
