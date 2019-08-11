package june15Homework;

import java.util.Scanner;

public class HW07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive integer: ");
        int num = sc.nextInt();
        int max = 0;
        int min = 0;
        if(num < 0) {
            System.out.println("Error: This is not positive integer");
        } else {
            int i = 0;
            while(i < num) {
                int n = sc.nextInt();
                if(i == 0) {
                    max = n;
                    min = n;
                }
                if(max < n) {
                    max = n;
                }
                if(min > n) {
                    min = n;
                }
                i++;
            }
            System.out.println("The max: " + max);
            System.out.println("The min: " + min);
        }
    }
}
